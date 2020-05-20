package com.bruce.service;

import com.bruce.bean.Post;
import com.bruce.bean.PostExample;
import com.bruce.dao.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bruce
 * @date 05-19-2020 18:35
 */
@Service
public class PostService {
    @Autowired
    PostMapper postMapper;
    public void addpost(Post post){
        postMapper.insert(post);
    }
    public List<Post> mypost(Integer userid){
        PostExample pe = new PostExample();
        PostExample.Criteria pc = pe.createCriteria();
        pc.andPostuseridEqualTo(userid);
        return postMapper.selectByExample(pe);
    }
    public Post getpost(Integer id){
        return postMapper.selectByPrimaryKey(id);
    }
}
