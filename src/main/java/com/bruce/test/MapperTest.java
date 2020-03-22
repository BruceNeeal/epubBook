package com.bruce.test;

import com.bruce.bean.Book;
import com.bruce.dao.BookMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author bruce
 * @date 03-21-2020 20:59
 * 测试dao层功能
 * 使用ContextConfiguration指定Spring配置文件位置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    BookMapper bookMapper;

    @Test
    public void testCRUD(){
        //书本级联查询测试
        System.out.println(bookMapper.selectByPrimaryKeyWithType("9781119092063").getType().getTypename());
    }
}
