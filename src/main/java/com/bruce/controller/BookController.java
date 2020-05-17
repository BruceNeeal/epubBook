package com.bruce.controller;

import com.bruce.bean.Book;
import com.bruce.bean.Msg;
import com.bruce.bean.Progress;
import com.bruce.bean.Type;
import com.bruce.service.BookService;
import com.bruce.service.ProgressService;
import com.bruce.service.TypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author bruce
 * @date 03-22-2020 21:11
 * 处理书本增删改查
 */
@Controller
public class BookController {

    @Autowired
    BookService bookService;
    @Autowired
    ProgressService progressService;
    @Autowired
    TypeService typeService;

    @RequestMapping("/getbooktype")
    @ResponseBody
    public Msg getbooktype(){
        List<Type> types = typeService.getType();
        return Msg.success().add("types",types);
    }

    @RequestMapping("/getbooks")
    @ResponseBody
    public Msg getBooks(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 6);
        List<Book> books = bookService.getAll();
        PageInfo page = new PageInfo(books, 3);
        return Msg.success().add("pageInfo", page);
    }

    @RequestMapping("/mybooks")
    @ResponseBody
    public Msg myBooks(@RequestParam(value = "pn", defaultValue = "1") Integer pn, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Integer userId = null;
        userId = (Integer) session.getAttribute("userId");
        if (userId == null) {
            return Msg.fail();
        } else {
            List<String> list = progressService.mybooksid(userId);
            PageHelper.startPage(pn, 6);
            List<Book> books = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                Book book = bookService.getBook(list.get(i));
                books.add(book);
            }
            PageInfo page = new PageInfo(books, 3);
            return Msg.success().add("pageInfo", page);
        }
    }

    @RequestMapping("/getbookswithtype")
    @ResponseBody
    public Msg getBooksWithType(@RequestParam(value = "pn", defaultValue = "1") Integer pn, @RequestParam(value = "typeid") Integer typeid) {
        PageHelper.startPage(pn, 6);
        List<Book> books = bookService.getAllWithType(typeid);
        PageInfo page = new PageInfo(books, 3);
        return Msg.success().add("pageInfo", page);
    }

    @RequestMapping(value = "/savepage", method = RequestMethod.POST)
    @ResponseBody
    public Msg savepage(@RequestParam(value = "bookid") String bookid,
                     @RequestParam(value = "bookpage") Integer bookpage, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Integer userId = null;
        userId = (Integer) session.getAttribute("userId");
        if (userId == null) {
            return Msg.fail();
        } else {
            Progress progress = new Progress();
            progress.setPage(bookpage);
            progress.setProgressuserid(userId);
            progress.setProgressbookid(bookid);
            progressService.saveprogress(progress);
            return Msg.success();
        }
    }
    @RequestMapping(value = "/getpage", method = RequestMethod.POST)
    @ResponseBody
    public Msg getpage(@RequestParam(value = "bookid") String bookid, HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer userId = null;
        userId = (Integer) session.getAttribute("userId");
        if (userId == null) {
            return Msg.fail();
        } else {
            int page = progressService.getprogress(bookid,userId);
            if (page==0){
                return Msg.fail();
            }
            else return Msg.success().add("page",page);
        }
    }

    @RequestMapping("addbook")
    public void addbook(@RequestParam(value = "bookid") String bookid,@RequestParam(value = "bookname") String bookname,
                        @RequestParam(value = "author") String author,@RequestParam(value = "description") String description,
            @RequestParam(value = "booktypeid") Integer booktypeid,
            @RequestParam(value = "imgfile") MultipartFile imgfile,@RequestParam(value = "bookfile") MultipartFile bookfile,
                        HttpServletRequest request,HttpServletResponse response) throws IOException {
        Book book = new Book();
        book.setBookid(bookid.trim());
        book.setBookname(bookname.trim());
        book.setAuthor(author.trim());
        book.setDescription(description.trim());
        book.setBooktypeid(booktypeid);
        String imgPath = request.getSession().getServletContext().getRealPath("/images/");
        String bookPath = request.getSession().getServletContext().getRealPath("/books/");
        String filename="";
        String imgcontentType = imgfile.getContentType();
        String bookcontentType = bookfile.getContentType();
        String imgtype = "."+imgcontentType.substring(imgcontentType.indexOf("/")+1);
        String booktype = "."+bookcontentType.substring(bookcontentType.indexOf("/")+1);
        if (bookid==null||bookid.trim().equals("")){
            if (bookname!=null){
                filename+=bookname;
            }
            filename+= UUID.randomUUID().toString().substring(0, 11);
            book.setBookid(filename);
        }
        else {
            filename=bookid.trim();
        }
        if (imgfile!=null&&!imgfile.isEmpty()) {
            book.setImg(filename+imgtype);
            imgfile.transferTo(new File(imgPath+filename+imgtype));
        }
        if (bookfile!=null&&!bookfile.isEmpty()) {
            bookfile.transferTo(new File(bookPath+filename+booktype));
            bookService.addbook(book);
            response.sendRedirect("/epubBook/index.html");
        }
        else response.sendRedirect("/epubBook/views/mydomain.html");
    }
}
