package com.eriol.blog.business.service.impl;

import com.eriol.blog.business.dao.ArticlesDao;
import com.eriol.blog.business.model.Articles;
import com.eriol.blog.business.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ArticlesServiceImpl implements ArticlesService {

    @Autowired
    private ArticlesDao articlesDao;

    public int insert(Articles entity){
        return articlesDao.insert(entity);
    }

    public int deleteByPrimaryKey(int key){
        return articlesDao.deleteByPrimaryKey(key);
    }

    public int updateByPrimaryKeySelective(Articles entity) {
        return articlesDao.updateByPrimaryKeySelective(entity);
    }

    public List<Articles> selectAll(){
        return articlesDao.selectAll();
    }

}
