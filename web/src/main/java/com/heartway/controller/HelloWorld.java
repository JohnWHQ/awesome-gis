package com.heartway.controller;

import com.heartway.entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanghanqi on 2019/10/23.
 */
@RestController
@RequestMapping(value = "/test")
public class HelloWorld {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public Result hello() {
        Result res = new Result();
        res.setData("hello world!");
        res.setSuccess();
        return res;
    }
}
