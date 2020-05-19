package com.bruce.controller;

import com.bruce.bean.Msg;
import com.bruce.bean.Post;
import com.bruce.service.PostService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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
    public Msg addpost(@RequestParam(value = "posttitle") String posttitle,
                       @RequestParam(value = "postbody") String postbody, HttpServletRequest request){
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
            Post post = new Post();
            post.setPosttitle(posttitle);
            post.setPostbody(postbody);
            post.setPostuserid(userId);
            postService.addpost(post);
            return Msg.success();
        }
    }

    @RequestMapping(value = "/myposts",method = RequestMethod.GET)
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
}
