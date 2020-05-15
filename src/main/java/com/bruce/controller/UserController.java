package com.bruce.controller;

import com.bruce.bean.Msg;
import com.bruce.bean.User;
import com.bruce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author bruce
 * @date 03-31-2020 21:11
 * 用户注册登录,管理员的添加
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    @ResponseBody
    public Msg regist(@RequestParam(value = "username")String username,
                      @RequestParam(value = "password")String password){
        User user = userService.findUserByName(username.trim());
        if (user==null){
            user = new User();
            user.setUsername(username.trim());
            user.setPassword(password.trim());
            user.setUserstatusid(2);
            userService.addUser(user);
            return Msg.success();
        }
        else return Msg.fail().add("wrong","Username has existed");
    }

    @RequestMapping("/mydomain")
    @ResponseBody
    public Msg mydomain(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer userId = null;
        userId = (Integer) session.getAttribute("userId");
        if (userId == null) {
            return Msg.fail();
        }else {
            return Msg.success();
        }
    }

    @RequestMapping("/getstatus")
    @ResponseBody
    public Msg getstatus(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer statusid =null;
        statusid = (Integer) session.getAttribute("statusId");
        if (statusid==null){
            return Msg.fail();
        }
        else {
            return Msg.success().add("statusid",statusid);
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Msg login(@RequestParam(value = "username")String username,
                     @RequestParam(value = "password")String password, HttpServletRequest request){
        User user = userService.findUserByName(username.trim());
        if (user == null) {
            return Msg.fail().add("wrong", "User is not exist");
        }else if (!user.getPassword().equals(password.trim())){
            return Msg.fail().add("wrong", "Password is wrong");
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("userId", user.getUserid());
            session.setAttribute("statusId",user.getUserstatusid());
            return Msg.success();
        }
    }
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    @ResponseBody
    public Msg logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("userId");
        return Msg.success();
    }
    @RequestMapping(value = "/changepw", method = RequestMethod.POST)
    @ResponseBody
    public Msg changepw(@RequestParam(value = "password1")String password1,
                        @RequestParam(value = "password2")String password2, HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer userId = null;
        userId = (Integer) session.getAttribute("userId");
        if (userId==null){
            return Msg.fail().add("wrong","Please login!");
        }else if (password1.trim().equals(password2.trim())==false){
            return Msg.fail().add("wrong","Password is not the same");
        }else {
            User user = userService.findUserById(userId);
            user.setPassword(password1.trim());
            userService.changepw(user);
            return Msg.success();
        }
    }
}
