package com.example.sport.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 微信用户
 * </p>
 *
 * @author XuShu
 * @since 2022-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("wx_user")
@ApiModel(value="WxUser对象", description="微信用户")
public class WxUser implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "微信名称")
    private String nickName;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "性别(0未知，1男，2女)")
    private Boolean gender;

    @ApiModelProperty(value = "用户电话号码")
    private String phoneNumber;

    @ApiModelProperty(value = "微信头像")
    private String avatarUrl;

    @ApiModelProperty(value = "注册时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;


}
