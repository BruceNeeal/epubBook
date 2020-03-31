package com.bruce.controller;

import com.bruce.bean.Book;
import com.bruce.bean.Msg;
import com.bruce.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/getbooks")
    @ResponseBody
    public Msg getBooks(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,6);
        List<Book> books = bookService.getAll();
        PageInfo page = new PageInfo(books,3);
        return Msg.success().add("pageInfo",page);
    }

    @RequestMapping("/getbookswithtype")
    @ResponseBody
    public Msg getBooksWithType(@RequestParam(value = "pn",defaultValue = "1")Integer pn, @RequestParam(value = "typeid")Integer typeid){
        PageHelper.startPage(pn,6);
        List<Book> books = bookService.getAllWithType(typeid);
        PageInfo page = new PageInfo(books,3);
        return Msg.success().add("pageInfo",page);
    }
}
