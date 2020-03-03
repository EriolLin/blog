package com.eriol.blog.business.service.impl;

import com.eriol.blog.business.dao.SetArticleSortDao;
import com.eriol.blog.business.model.SetArticleSort;
import com.eriol.blog.business.service.SetArticleSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetArticleSortServiceImpl implements SetArticleSortService {

    @Autowired
    private SetArticleSortDao setArticleSortDao;


    @Override
    public List<SetArticleSort> selectAll() {
        return setArticleSortDao.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(int key) {
        return setArticleSortDao.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(SetArticleSort entity) {
        return setArticleSortDao.insert(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(SetArticleSort entity) {
        return setArticleSortDao.updateByPrimaryKeySelective(entity);
    }
}
