package com.eriol.blog.business.service.impl;

import com.eriol.blog.business.dao.CommentsDao;
import com.eriol.blog.business.model.Comments;
import com.eriol.blog.business.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceimpl implements CommentsService {

    @Autowired
    private CommentsDao commentsDao;

    @Override
    public List<Comments> selectAll() {
        return commentsDao.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(int key) {
        return commentsDao.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Comments entity) {
        return commentsDao.insert(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(Comments entity) {
        return commentsDao.updateByPrimaryKeySelective(entity);
    }
}
