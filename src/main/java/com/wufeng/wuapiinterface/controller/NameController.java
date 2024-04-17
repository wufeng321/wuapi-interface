package com.wufeng.wuapiinterface.controller;

import com.wufeng.wuapiinterface.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author wufeng
 * @date 2024/4/17 15:58
 * @Description:
 */

@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/getNameByGet")
    public String getNameByGet(String name){
        return "GET 你的名字是"+ name;
    }
    @PostMapping("/getNameByPost")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是"+ name;
    }
    @PostMapping("/getUserNameByPost")
    public String getUserNameByPost(@RequestBody User user){
        return"P0ST 用户名字是"+ user.getUsername();
    }
}
