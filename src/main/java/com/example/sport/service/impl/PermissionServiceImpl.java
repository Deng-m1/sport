package com.example.sport.service.impl;

import com.example.sport.model.Permission;
import com.example.sport.mapper.PermissionMapper;
import com.example.sport.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sport.service.RolesPremissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {


    @Autowired
    PermissionMapper permissionMapper;
    @Override
    public List<Permission> GetPermissons(List<Integer> list) {
        List<Permission> result=new ArrayList<>();
        list.forEach(Id->{
            result.add(permissionMapper.selectById(Id));
        }
        );
        return result;
    }
}
