package com.eriol.blog.business.service.impl;

import com.eriol.blog.business.dao.UserFriendsDao;
import com.eriol.blog.business.model.UserFriends;
import com.eriol.blog.business.service.UserFriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserFriendsServiceImpl implements UserFriendsService {
    @Autowired
    private UserFriendsDao userFriendsDao;

    @Override
    public List<UserFriends> selectAll() {
        return userFriendsDao.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(int key) {
        return userFriendsDao.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(UserFriends entity) {
        return userFriendsDao.insert(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(UserFriends entity) {
        return userFriendsDao.updateByPrimaryKeySelective(entity);
    }
}
