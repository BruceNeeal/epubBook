package com.bruce.service;

import com.bruce.bean.Type;
import com.bruce.dao.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bruce
 * @date 05-17-2020 15:11
 */
@Service
public class TypeService {
    @Autowired
    TypeMapper typeMapper;
    public List<Type> getType(){
        return typeMapper.selectByExample(null);
    }
}
