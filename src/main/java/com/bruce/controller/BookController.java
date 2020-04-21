package com.bruce.controller;

import com.bruce.bean.Book;
import com.bruce.bean.Msg;
import com.bruce.bean.Progress;
import com.bruce.service.BookService;
import com.bruce.service.ProgressService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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
    public Msg login(@RequestParam(value = "bookid") String bookid,
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
}
