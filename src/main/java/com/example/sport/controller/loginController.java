package com.example.sport.controller;

import com.example.sport.service.EasyuserService;
import com.example.sport.utils.PageResult;
import com.example.sport.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class loginController {
    @Autowired
    EasyuserService easyuserService;
    @RequestMapping("/login")
    public Result Login()
    {
        return new Result(true,easyuserService.list());
    }
}
