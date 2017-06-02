package com.yangchen.xincheng.controller;

import com.yangchen.xincheng.common.Response;
import com.yangchen.xincheng.entity.UserEntity;
import com.yangchen.xincheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by yangchen on 2017/6/2.
 */
@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Response<String> registerUser(@RequestBody UserEntity user) {
        Response<String> res = new Response<>();

        String result = userService.register(user);
        res.setEntity(result);
        return res;
    }

}
