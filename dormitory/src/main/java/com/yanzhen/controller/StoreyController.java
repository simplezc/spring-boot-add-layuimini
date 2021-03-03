package com.yanzhen.controller;

import com.github.pagehelper.PageInfo;
import com.yanzhen.entity.Storey;
import com.yanzhen.service.StoreyService;
import com.yanzhen.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/storey")
public class StoreyController {

    @Autowired
    private StoreyService storeyService;

    @PostMapping("create")
    public Result create(@RequestBody Storey storey){
        int flag = storeyService.create(storey);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = storeyService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Storey storey){
        int flag = storeyService.update(storey);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Storey detail(Integer id){
        return storeyService.detail(id);
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Storey storey){

        PageInfo<Storey> pageInfo = storeyService.query(storey);
        return Result.ok(pageInfo);
    }

}
