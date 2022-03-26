package com.example.sport.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.sport.model.Easyuser;
import com.example.sport.model.Permission;
import com.example.sport.model.RolesPremissions;
import com.example.sport.mapper.RolesPremissionsMapper;
import com.example.sport.service.RolesPremissionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.swagger.models.auth.In;
import lombok.val;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XuShu
 * @since 2022-03-24
 */
@Service
public class RolesPremissionsServiceImpl extends ServiceImpl<RolesPremissionsMapper, RolesPremissions> implements RolesPremissionsService {

    @Autowired
    RolesPremissionsMapper rolesPremissionsMapper;
    @Override
    public List<RolesPremissions> FindByRoleID(Integer roleID) {
        LambdaQueryWrapper<RolesPremissions> lqw=new LambdaQueryWrapper<RolesPremissions>();
        lqw.like(RolesPremissions::getRoleId,roleID);
        List<RolesPremissions> list = rolesPremissionsMapper.selectList(lqw);
        return list;
    }
}
