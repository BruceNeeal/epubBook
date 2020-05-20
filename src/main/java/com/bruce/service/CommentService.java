package com.bruce.service;

import com.bruce.bean.Comment;
import com.bruce.bean.CommentExample;
import com.bruce.dao.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bruce
 * @date 05-20-2020 21:36
 */
@Service
public class CommentService {
    @Autowired
    CommentMapper commentMapper;
    public void addcomment(Comment comment){
        commentMapper.insertSelective(comment);
    }
    public List<Comment> getcomment(Integer id){
        CommentExample ce = new CommentExample();
        CommentExample.Criteria cc = ce.createCriteria();
        cc.andCommentpostidEqualTo(id);
        return commentMapper.selectByExample(ce);
    }
}
