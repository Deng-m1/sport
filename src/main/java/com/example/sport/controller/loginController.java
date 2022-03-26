package com.example.sport.controller;

import com.example.sport.Dto.LoginDto;
import com.example.sport.service.EasyuserService;
import com.example.sport.utils.PageResult;
import com.example.sport.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class loginController {
    @Autowired
    EasyuserService easyuserService;
    @PostMapping("/login")
    public Result Login(@RequestBody LoginDto loginDto)
    {
        return new Result(true,easyuserService.list());
    }
}
