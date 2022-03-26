package com.example.sport.service;

import com.example.sport.Dto.LoginDto;
import com.example.sport.utils.Result;

public interface LoginService {
    public Result login(LoginDto loginDto);
}
