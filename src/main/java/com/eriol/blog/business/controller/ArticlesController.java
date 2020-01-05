package com.eriol.blog.business.controller;

import com.eriol.blog.business.model.Articles;
import com.eriol.blog.business.service.ArticlesService;
import com.eriol.blog.common.entity.Result;
import com.eriol.blog.common.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog/articles")
public class ArticlesController {

    @Autowired
    ArticlesService articlesService;

    @PostMapping("/insert")
    public Result insert(@RequestBody Articles articles){
        return new Result(true, StatusCode.OK, "插入成功", articlesService.insert(articles));
    }

    @DeleteMapping("/deleteByPrimaryKey/{key}")
    public Result delete(@PathVariable("key") String key){
        return new Result(true, StatusCode.OK, "删除成功", articlesService.deleteByPrimaryKey(Integer.parseInt(key)));
    }

    @PutMapping("/updateByPrimaryKey")
    public Result updateByPrimaryKey(@RequestBody Articles articles){
        return new Result(true, StatusCode.OK, "更新成功", articlesService.updateByPrimaryKeySelective(articles));
    }

    @GetMapping("/selectAll")
    public Result selectAll(){
        return new Result(true, StatusCode.OK, "查询成功", articlesService.selectAll());
    }



}
