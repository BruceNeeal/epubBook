package com.bruce.dao;

import com.bruce.bean.Status;
import com.bruce.bean.StatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusMapper {
    long countByExample(StatusExample example);

    int deleteByExample(StatusExample example);

    int deleteByPrimaryKey(Integer statusid);

    int insert(Status record);

    int insertSelective(Status record);

    List<Status> selectByExample(StatusExample example);

    Status selectByPrimaryKey(Integer statusid);

    int updateByExampleSelective(@Param("record") Status record, @Param("example") StatusExample example);

    int updateByExample(@Param("record") Status record, @Param("example") StatusExample example);

    int updateByPrimaryKeySelective(Status record);

    int updateByPrimaryKey(Status record);
}