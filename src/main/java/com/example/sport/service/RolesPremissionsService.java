package com.example.sport.service;

import com.example.sport.model.Easyuser;
import com.example.sport.model.RolesPremissions;
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
public interface RolesPremissionsService extends IService<RolesPremissions> {
    public List FindByRoleID(Integer roleID);

}
