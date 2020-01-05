package com.eriol.blog.common.base.Service;

import java.util.List;

public interface BfService<T> {

    public List<T> selectAll();

    public int deleteByPrimaryKey(int key);

    public int insert(T entity);

    public int updateByPrimaryKeySelective(T entity);

}
