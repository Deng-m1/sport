package com.example.sport.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.example.sport.service.EasyuserService;
import com.example.sport.service.RolesPremissionsService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author XuShu
 * @since 2022-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("easyuser")
@ApiModel(value="Easyuser对象", description="用户表")
public class Easyuser implements Serializable, UserDetails {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "登录名")
    private String username;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "当前状态(0未激活，1激活)")
    private Boolean state;

    @ApiModelProperty(value = "头像")
    private String avatarUrl;

    @Autowired
    EasyuserService easyuserService;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList=new ArrayList<>();
        List<String> list = easyuserService.GetPermissions(this.id);
        list.forEach(permission->{
            authorityList.add(new SimpleGrantedAuthority(permission));
        });
        return authorityList;
    }


    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
