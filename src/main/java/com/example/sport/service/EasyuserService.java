package com.example.sport.service;

import com.example.sport.model.Easyuser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author XuShu
 * @since 2022-03-24
 */
public interface EasyuserService extends IService<Easyuser> {
    public Easyuser FindByUsername(String username);
    public List<String> GetPermissions(Integer Id);

}
