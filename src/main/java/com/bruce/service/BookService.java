package com.bruce.service;

import com.bruce.bean.Book;
import com.bruce.bean.BookExample;
import com.bruce.dao.BookMapper;
import org.mybatis.generator.codegen.ibatis2.model.ExampleGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bruce
 * @date 03-22-2020 21:21
 */
@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    public List<Book> getAll(){
        return bookMapper.selectByExampleWithType(null);
    }

    public List<Book> getAllWithType(Integer typeid){
        BookExample be = new BookExample();
        BookExample.Criteria bc = be.createCriteria();
        bc.andBooktypeidEqualTo(typeid);
        return bookMapper.selectByExampleWithType(be);
    }

    public Book getBook(String s){
        return bookMapper.selectByPrimaryKeyWithType(s.trim());
    }
}