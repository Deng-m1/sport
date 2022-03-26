package com.example.sport.service.impl;

import com.example.sport.Dto.LoginDto;
import com.example.sport.service.EasyuserService;
import com.example.sport.service.LoginService;
import com.example.sport.utils.Result;
import com.example.sport.utils.TokenUtil;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashMap;
import java.util.Map;

public class LoginServiceImpl implements LoginService {
    @Autowired
    private EasyuserService easyuserService;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private TokenUtil tokenUtil;


    @Override
    public Result login(LoginDto loginDto) {
        UserDetails username = userDetailsService.loadUserByUsername(loginDto.getUsername());
        if (null==username||!passwordEncoder.matches(loginDto.getPassword(),username.getPassword()))
        {
            return new Result(false,"登录失败");
        }
        if (!username.isEnabled())
        {
            return new Result(false,"该账号已禁用");
        }
        UsernamePasswordAuthenticationToken authenticationToken=new UsernamePasswordAuthenticationToken(
                username,null,username.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        String token=tokenUtil.generateToken(username);
        Map<String,String> map=new HashMap<>(2);
        map.put("tokenHead",tokenHead);
        map.put("token",token);
        return Result.success("登陆成功",map);
    }
}
