package com.eriol.blog.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eriol.blog.business.model.UserFriends;
import com.eriol.blog.business.service.UserFriendsService;
import com.eriol.blog.common.entity.Result;
import com.eriol.blog.common.entity.StatusCode;

@RestController
@RequestMapping("/blog/userFriends")
public class UserFriendsController {
	
	@Autowired
	private UserFriendsService userFriendsService;
	
	@PostMapping("/insert")
    public Result insert(@RequestBody UserFriends userFriends){
        return new Result(true, StatusCode.OK, "插入成功", userFriendsService.insert(userFriends));
    }

    @DeleteMapping("/deleteByPrimaryKey/{key}")
    public Result delete(@PathVariable("key") String key){
        return new Result(true, StatusCode.OK, "删除成功", userFriendsService.deleteByPrimaryKey(Integer.parseInt(key)));
    }

    @PutMapping("/updateByPrimaryKeySelective")
    public Result updateByPrimaryKeySelective(@RequestBody UserFriends userFriends){
        return new Result(true, StatusCode.OK, "更新成功", userFriendsService.updateByPrimaryKeySelective(userFriends));
    }

    @GetMapping("/selectAll")
    public Result selectAll(){
        return new Result(true, StatusCode.OK, "查询成功", userFriendsService.selectAll());
    }
	
}
