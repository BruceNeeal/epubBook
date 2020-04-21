package com.bruce.service;

import com.bruce.bean.Progress;
import com.bruce.bean.ProgressExample;
import com.bruce.dao.ProgressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bruce
 * @date 04-20-2020 22:39
 */
@Service
public class ProgressService {
    @Autowired
    ProgressMapper progressMapper;
    public void saveprogress(Progress progress){
        List<Progress> list;
        ProgressExample pe = new ProgressExample();
        ProgressExample.Criteria pc = pe.createCriteria();
        pc.andProgressbookidEqualTo(progress.getProgressbookid());
        pc.andProgressuseridEqualTo(progress.getProgressuserid());
        list = progressMapper.selectByExample(pe);
        if (list.size()>0){
            progressMapper.updateByExampleSelective(progress,pe);
        }
        else progressMapper.insert(progress);
    }
    public List<String> mybooksid(Integer userid){
        List<String> list = new ArrayList<>();
        ProgressExample pe = new ProgressExample();
        ProgressExample.Criteria pc = pe.createCriteria();
        pc.andProgressuseridEqualTo(userid);
        List<Progress> plist = progressMapper.selectByExample(pe);
        for (int i = 0; i < plist.size(); i++) {
            list.add(plist.get(i).getProgressbookid());
        }
        return list;
    }
}
