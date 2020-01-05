package com.eriol.blog.business.service.impl;

import com.eriol.blog.business.dao.UsersDao;
import com.eriol.blog.business.model.Users;
import com.eriol.blog.business.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public List<Users> selectAll() {
        return usersDao.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(int key) {
        return usersDao.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Users entity) {
        return usersDao.insert(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(Users entity) {
        return usersDao.updateByPrimaryKeySelective(entity);
    }
}
