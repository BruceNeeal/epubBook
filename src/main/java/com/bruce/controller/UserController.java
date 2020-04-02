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
}
