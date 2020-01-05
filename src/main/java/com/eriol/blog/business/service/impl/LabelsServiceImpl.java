package com.eriol.blog.business.service.impl;

import com.eriol.blog.business.dao.LabelsDao;
import com.eriol.blog.business.model.Labels;
import com.eriol.blog.business.service.LabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelsServiceImpl implements LabelsService {

    @Autowired
    private LabelsDao labelsDao;

    @Override
    public List<Labels> selectAll() {
        return labelsDao.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(int key) {
        return labelsDao.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Labels entity) {
        return labelsDao.insert(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(Labels entity) {
        return labelsDao.updateByPrimaryKeySelective(entity);
    }
}
