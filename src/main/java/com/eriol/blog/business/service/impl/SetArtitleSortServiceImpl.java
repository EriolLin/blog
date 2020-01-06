package com.eriol.blog.business.service.impl;

import com.eriol.blog.business.dao.SetArtitleSortDao;
import com.eriol.blog.business.model.SetArtitleSort;
import com.eriol.blog.business.service.SetArtitleSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetArtitleSortServiceImpl implements SetArtitleSortService {

    @Autowired
    private SetArtitleSortDao setArtitleSortDao;


    @Override
    public List<SetArtitleSort> selectAll() {
        return setArtitleSortDao.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(int key) {
        return setArtitleSortDao.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(SetArtitleSort entity) {
        return setArtitleSortDao.insert(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(SetArtitleSort entity) {
        return setArtitleSortDao.updateByPrimaryKeySelective(entity);
    }
}
