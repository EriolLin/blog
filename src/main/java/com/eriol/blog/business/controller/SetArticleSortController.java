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

import com.eriol.blog.business.model.SetArticleSort;
import com.eriol.blog.business.service.SetArticleSortService;
import com.eriol.blog.common.entity.Result;
import com.eriol.blog.common.entity.StatusCode;

@RestController
@RequestMapping("/blog/setArticleSort")
public class SetArticleSortController {

	@Autowired
	private SetArticleSortService setArticleSortService;

	@PostMapping("/insert")
    public Result insert(@RequestBody SetArticleSort setArticleSort){
        return new Result(true, StatusCode.OK, "插入成功", setArticleSortService.insert(setArticleSort));
    }

    @DeleteMapping("/deleteByPrimaryKey/{key}")
    public Result delete(@PathVariable("key") String key){
        return new Result(true, StatusCode.OK, "删除成功", setArticleSortService.deleteByPrimaryKey(Integer.parseInt(key)));
    }

    @PutMapping("/updateByPrimaryKeySelective")
    public Result updateByPrimaryKeySelective(@RequestBody SetArticleSort setArticleSort){
        return new Result(true, StatusCode.OK, "更新成功", setArticleSortService.updateByPrimaryKeySelective(setArticleSort));
    }

    @GetMapping("/selectAll")
    public Result selectAll(){
        return new Result(true, StatusCode.OK, "查询成功", setArticleSortService.selectAll());
    }

}
