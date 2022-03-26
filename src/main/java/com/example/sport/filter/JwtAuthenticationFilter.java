package com.example.sport.filter;

import com.example.sport.service.EasyuserService;
import com.example.sport.utils.TokenUtil;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationFilter extends OncePerRequestFilter {
    @Autowired
    private TokenUtil tokenUtil;
    @Autowired
    private EasyuserService easyuserService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authHeader=request.getHeader(tokenHeader);
        if (null!=authHeader&&authHeader.startsWith(tokenHead))
        {
            String token = authHeader.substring(tokenHead.length());
        }
    }
}
