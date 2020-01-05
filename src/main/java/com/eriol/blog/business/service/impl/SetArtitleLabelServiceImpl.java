package com.eriol.blog.business.service.impl;

import com.eriol.blog.business.dao.SetArtitleLabelDao;
import com.eriol.blog.business.model.SetArtitleLabel;
import com.eriol.blog.business.service.SetArtitleLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetArtitleLabelServiceImpl implements SetArtitleLabelService {

    @Autowired
    private SetArtitleLabelDao setArtitleLabelDao;

    @Override
    public List<SetArtitleLabel> selectAll() {
        return setArtitleLabelDao.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(int key) {
        return setArtitleLabelDao.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(SetArtitleLabel entity) {
        return setArtitleLabelDao.insert(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(SetArtitleLabel entity) {
        return setArtitleLabelDao.updateByPrimaryKeySelective(entity);
    }
}
