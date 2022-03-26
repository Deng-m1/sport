package com.example.sport.service;

import com.example.sport.model.Permission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XuShu
 * @since 2022-03-24
 */
public interface PermissionService extends IService<Permission> {
    public List GetPermissons(List<Integer> list);

}
