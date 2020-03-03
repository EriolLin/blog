package com.eriol.blog.business.dao;

import com.eriol.blog.business.model.UserFriends;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserFriendsDao  extends tk.mybatis.mapper.common.Mapper<UserFriends> {
}
