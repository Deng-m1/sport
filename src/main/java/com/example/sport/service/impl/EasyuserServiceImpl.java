package com.example.sport.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.sport.model.Easyuser;
import com.example.sport.mapper.EasyuserMapper;
import com.example.sport.service.EasyuserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.val;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author XuShu
 * @since 2022-03-24
 */
@Service
public class EasyuserServiceImpl extends ServiceImpl<EasyuserMapper, Easyuser> implements EasyuserService {
    @Autowired
    EasyuserMapper easyuserMapper;

    @Override
    public Easyuser FindByUsername(String username) {
        LambdaQueryWrapper<Easyuser> lqw=new LambdaQueryWrapper<Easyuser>();
        lqw.like(Strings.isNotEmpty(username),Easyuser::getUsername,username);
        Easyuser easyuser = easyuserMapper.selectOne(lqw);
        return easyuser;


    }
    public List<String> GetPermissions(Integer Id)
    {
        return easyuserMapper.selectPermission(Id);
    }
}
