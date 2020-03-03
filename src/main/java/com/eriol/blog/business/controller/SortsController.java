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

import com.eriol.blog.business.model.Sorts;
import com.eriol.blog.business.service.SortsService;
import com.eriol.blog.common.entity.Result;
import com.eriol.blog.common.entity.StatusCode;

@RestController
@RequestMapping("/blog/sorts")
public class SortsController {
	
	@Autowired
	private SortsService sortsService;
	
	@PostMapping("/insert")
    public Result insert(@RequestBody Sorts sorts){
        return new Result(true, StatusCode.OK, "插入成功", sortsService.insert(sorts));
    }

    @DeleteMapping("/deleteByPrimaryKey/{key}")
    public Result delete(@PathVariable("key") String key){
        return new Result(true, StatusCode.OK, "删除成功", sortsService.deleteByPrimaryKey(Integer.parseInt(key)));
    }

    @PutMapping("/updateByPrimaryKeySelective")
    public Result updateByPrimaryKeySelective(@RequestBody Sorts sorts){
        return new Result(true, StatusCode.OK, "更新成功", sortsService.updateByPrimaryKeySelective(sorts));
    }

    @GetMapping("/selectAll")
    public Result selectAll(){
        return new Result(true, StatusCode.OK, "查询成功", sortsService.selectAll());
    }

    @GetMapping("/getSortOption")
    public Result getSortOption(){
        return new Result(true, StatusCode.OK, "查询成功", sortsService.sortOption().getChildren());
    }

}
