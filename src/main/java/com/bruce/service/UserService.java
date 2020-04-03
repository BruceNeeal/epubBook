package com.bruce.service;

import com.bruce.bean.User;
import com.bruce.bean.UserExample;
import com.bruce.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bruce
 * @date 03-31-2020 21:21
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public void addUser(User user){
        userMapper.insertSelective(user);
    }

    public User findUserByName(String username){
        UserExample ue = new UserExample();
        UserExample.Criteria uc = ue.createCriteria();
        uc.andUsernameEqualTo(username.trim());
        List<User> list = userMapper.selectByExample(ue);
        if (list.size()==0){
            return null;
        }
        else return list.get(0);
    }

    public User findUserById(Integer userId){
        return userMapper.selectByPrimaryKey(userId);
    }
    public void changepw(User user){
        userMapper.updateByPrimaryKey(user);
    }
}
