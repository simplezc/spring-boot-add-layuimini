package com.yanzhen.controller;


import com.github.pagehelper.PageInfo;
import com.yanzhen.entity.User;
import com.yanzhen.service.UserService;
import com.yanzhen.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("create")
    public Result create(@RequestBody User user){

      int flag = userService.create(user);
      if(flag>0){

          return Result.ok();
      }else {
          return Result.fail();
      }
    }

    @GetMapping("/delete")
    public Result delete(String ids){
       int flag = userService.delete(ids);
       if(flag>0){
           return Result.ok();
       }else {
           return Result.fail();
       }

    }

    @PostMapping("update")
    public Result update(@RequestBody User user){
        int flag = userService.updateSelective(user);
        if(flag>0){

            return Result.ok();
        }else {
            return Result.fail();
        }
    }

    @GetMapping("/datail")
    public User datail(Integer id){
       return userService.detail(id);

    }

    @GetMapping("info")
    public Result info(HttpServletRequest request){
        User user = (User)request.getAttribute("user");
        return Result.ok(userService.detail(user.getId()));
    }

    @PostMapping("/query")
    public Map<String,Object> query(@RequestBody User user){
        PageInfo<User> pageInfo = userService.query(user);

        return Result.ok(pageInfo);
    }






}
