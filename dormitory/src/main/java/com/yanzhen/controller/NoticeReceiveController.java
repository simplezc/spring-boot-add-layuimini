package com.yanzhen.controller;

import com.github.pagehelper.PageInfo;
import com.yanzhen.entity.NoticeReceive;
import com.yanzhen.service.NoticeReceiveService;
import com.yanzhen.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/noticeReceive")
public class NoticeReceiveController {

    @Autowired
    private NoticeReceiveService noticeReceiveService;

    @PostMapping("create")
    public Result create(@RequestBody NoticeReceive noticeReceive){
        int flag = noticeReceiveService.create(noticeReceive);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = noticeReceiveService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody NoticeReceive noticeReceive){
        int flag = noticeReceiveService.update(noticeReceive);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public NoticeReceive detail(Integer id){
        return noticeReceiveService.detail(id);
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  NoticeReceive noticeReceive){
        System.out.println();
        PageInfo<NoticeReceive> pageInfo = noticeReceiveService.query(noticeReceive);
        return Result.ok(pageInfo);
    }

}
