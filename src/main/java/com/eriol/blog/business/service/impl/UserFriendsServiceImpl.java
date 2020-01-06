package com.eriol.blog.business.service.impl;

import com.eriol.blog.business.dao.ArticlesDao;
import com.eriol.blog.business.dao.UserFriendsDao;
import com.eriol.blog.business.model.Articles;
import com.eriol.blog.business.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserFriendsServiceImpl implements ArticlesService {

    @Autowired
    private UserFriendsDao userFriendsDao;

    @Override
	public int insert(Articles entity){
        return userFriendsDao.insert(entity);
    }

    @Override
	public int deleteByPrimaryKey(int key){
        return userFriendsDao.deleteByPrimaryKey(key);
    }

    @Override
	public int updateByPrimaryKeySelective(Articles entity) {
        return userFriendsDao.updateByPrimaryKeySelective(entity);
    }

    @Override
	public List<Articles> selectAll(){
        return userFriendsDao.selectAll();
    }

}
