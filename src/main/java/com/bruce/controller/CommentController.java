package com.bruce.controller;

import com.bruce.bean.Comment;
import com.bruce.bean.Msg;
import com.bruce.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author bruce
 * @date 05-20-2020 21:36
 */
@Controller
public class CommentController {
    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/addcomment",method = RequestMethod.POST)
    @ResponseBody
    public Msg addcomment(@RequestParam(value = "commentpostid") Integer commentpostid,
                          @RequestParam(value = "commentbody") String commentbody,
                          HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer userId = null;
        userId = (Integer) session.getAttribute("userId");
        if (userId == null) {
            return Msg.fail().add("wrong","Please login!");
        }
        else {
            Comment comment = new Comment();
            comment.setCommentpostid(commentpostid);
            comment.setCommentbody(commentbody);
            comment.setCommentuserid(userId);
            commentService.addcomment(comment);
            return Msg.success();
        }
    }

    @RequestMapping(value = "/getcomment",method = RequestMethod.POST)
    @ResponseBody
    public Msg getcomment(@RequestParam(value = "postid") Integer postid){
        List<Comment> list = commentService.getcomment(postid);
        return Msg.success().add("list",list);
    }
}
