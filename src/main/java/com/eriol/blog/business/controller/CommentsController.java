package com.eriol.blog.business.controller;

import com.eriol.blog.business.model.Comments;
import com.eriol.blog.business.service.CommentsService;
import com.eriol.blog.common.entity.Result;
import com.eriol.blog.common.entity.StatusCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog/comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;
    
    @PostMapping("/insert")
    public Result insert(@RequestBody Comments comments){
        return new Result(true, StatusCode.OK, "插入成功", commentsService.insert(comments));
    }

    @DeleteMapping("/deleteByPrimaryKey/{key}")
    public Result delete(@PathVariable("key") String key){
        return new Result(true, StatusCode.OK, "删除成功", commentsService.deleteByPrimaryKey(Integer.parseInt(key)));
    }

    @PutMapping("/updateByPrimaryKeySelective")
    public Result updateByPrimaryKeySelective(@RequestBody Comments comments){
        return new Result(true, StatusCode.OK, "更新成功", commentsService.updateByPrimaryKeySelective(comments));
    }

    @GetMapping("/selectAll")
    public Result selectAll(){
        return new Result(true, StatusCode.OK, "查询成功", commentsService.selectAll());
    }

}
