package com.eriol.blog.business.service.impl;

import com.eriol.blog.business.dao.SortsDao;
import com.eriol.blog.business.model.Sorts;
import com.eriol.blog.business.service.SortsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortsServiceImpl implements SortsService {

    @Autowired
    private SortsDao sortsDao;

    @Override
    public List<Sorts> selectAll() {
        return sortsDao.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(int key) {
        return sortsDao.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Sorts entity) {
        return sortsDao.insert(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(Sorts entity) {
        return sortsDao.updateByPrimaryKeySelective(entity);
    }
}
