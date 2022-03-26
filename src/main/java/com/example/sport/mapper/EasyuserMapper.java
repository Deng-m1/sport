package com.example.sport.mapper;

import com.example.sport.model.Easyuser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author XuShu
 * @since 2022-03-24
 */
public interface EasyuserMapper extends BaseMapper<Easyuser> {
    List<String> selectPermission(Integer roleId);
    Map<String,Object> selectRoleFromUser(Integer userId);

}
