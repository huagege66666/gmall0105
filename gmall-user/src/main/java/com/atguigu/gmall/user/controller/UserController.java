package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 描述：
 *
 * @ClassName UserController
 * @Author Administrator
 * @Date 2019/8/30 0030 17:31
 * @Version 1.0.0
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public String index(){
        return "hello user";
    }


    @GetMapping("/getAllUser")
    public List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/getReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId( String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses=userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }
}
