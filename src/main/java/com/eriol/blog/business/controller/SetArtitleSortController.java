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

import com.eriol.blog.business.model.SetArtitleSort;
import com.eriol.blog.business.service.SetArtitleSortService;
import com.eriol.blog.common.entity.Result;
import com.eriol.blog.common.entity.StatusCode;

@RestController
@RequestMapping("/blog/setArtitleSort")
public class SetArtitleSortController {
	
	@Autowired
	private SetArtitleSortService setArtitleSortService;
	
	@PostMapping("/insert")
    public Result insert(@RequestBody SetArtitleSort setArtitleSort){
        return new Result(true, StatusCode.OK, "插入成功", setArtitleSortService.insert(setArtitleSort));
    }

    @DeleteMapping("/deleteByPrimaryKey/{key}")
    public Result delete(@PathVariable("key") String key){
        return new Result(true, StatusCode.OK, "删除成功", setArtitleSortService.deleteByPrimaryKey(Integer.parseInt(key)));
    }

    @PutMapping("/updateByPrimaryKeySelective")
    public Result updateByPrimaryKeySelective(@RequestBody SetArtitleSort setArtitleSort){
        return new Result(true, StatusCode.OK, "更新成功", setArtitleSortService.updateByPrimaryKeySelective(setArtitleSort));
    }

    @GetMapping("/selectAll")
    public Result selectAll(){
        return new Result(true, StatusCode.OK, "查询成功", setArtitleSortService.selectAll());
    }
	
}
