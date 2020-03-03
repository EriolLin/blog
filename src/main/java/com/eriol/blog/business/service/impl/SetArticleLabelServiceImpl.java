package com.eriol.blog.business.service.impl;

import com.eriol.blog.business.dao.SetArticleLabelDao;
import com.eriol.blog.business.model.SetArticleLabel;
import com.eriol.blog.business.service.SetArticleLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetArticleLabelServiceImpl implements SetArticleLabelService {

    @Autowired
    private SetArticleLabelDao setArticleLabelDao;

    @Override
    public List<SetArticleLabel> selectAll() {
        return setArticleLabelDao.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(int key) {
        return setArticleLabelDao.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(SetArticleLabel entity) {
        return setArticleLabelDao.insert(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(SetArticleLabel entity) {
        return setArticleLabelDao.updateByPrimaryKeySelective(entity);
    }
}
