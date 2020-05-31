package com.bruce.controller;

import com.bruce.bean.Msg;
import com.bruce.bean.Post;
import com.bruce.service.PostService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author bruce
 * @date 05-19-2020 18:26
 */
@Controller
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping(value = "/addpost",method = RequestMethod.POST)
    @ResponseBody
    public Msg addpost(@RequestBody Post post, HttpServletRequest request){
        String posttitle = post.getPosttitle();
        HttpSession session = request.getSession();
        Integer userId = null;
        userId = (Integer) session.getAttribute("userId");
        if (userId == null) {
            return Msg.fail().add("wrong","Please login!");
        }
        else {
            if (posttitle==null||posttitle.trim().equals("")){
                return Msg.fail().add("wrong","Please input a title!");
            }
            post.setPostuserid(userId);
            postService.addpost(post);
            return Msg.success();
        }
    }

    @RequestMapping(value = "/updatepost",method = RequestMethod.POST)
    @ResponseBody
    public Msg updatepost(@RequestBody Post post, HttpServletRequest request){
        String posttitle = post.getPosttitle();
        HttpSession session = request.getSession();
        Integer userId = null;
        userId = (Integer) session.getAttribute("userId");
        if (userId == null) {
            return Msg.fail().add("wrong","Please login!");
        }
        else {
            if (posttitle==null||posttitle.trim().equals("")){
                return Msg.fail().add("wrong","Please input a title!");
            }
            post.setPostuserid(userId);
            postService.updatepost(post);
            return Msg.success();
        }
    }

    @RequestMapping(value = "/myposts",method = RequestMethod.POST)
    @ResponseBody
    public Msg myposts(@RequestParam(value = "pn", defaultValue = "1") Integer pn, HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer userId = null;
        userId = (Integer) session.getAttribute("userId");
        if (userId == null) {
            return Msg.fail();
        }
        else {
            PageHelper.startPage(pn, 6);
            List<Post> list = postService.mypost(userId);
            PageInfo page = new PageInfo(list, 3);
            return Msg.success().add("pageInfo",page);
        }
    }

    @RequestMapping(value = "/getpost",method = RequestMethod.POST)
    @ResponseBody
    public Msg getpost(@RequestParam(value = "postid") Integer postid){
        Post post = postService.getpost(postid);
        return Msg.success().add("post",post);
    }

    @RequestMapping(value = "deletepost",method = RequestMethod.POST)
    @ResponseBody
    public Msg deletepost(@RequestParam(value = "postid") Integer postid){
        postService.deletepost(postid);
        return Msg.success();
    }
    @RequestMapping(value = "/allposts",method = RequestMethod.POST)
    @ResponseBody
    public Msg allposts(@RequestParam(value = "pn", defaultValue = "1") Integer pn){
        PageHelper.startPage(pn, 6);
        List<Post> list = postService.allposts();
        PageInfo page = new PageInfo(list, 3);
        return Msg.success().add("pageInfo",page);
    }
}
