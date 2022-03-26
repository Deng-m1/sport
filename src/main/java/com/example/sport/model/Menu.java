package com.example.sport.model;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author XuShu
 * @since 2022-03-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("menu")
@ApiModel(value="Menu对象", description="")
public class Menu implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    @ApiModelProperty(value = "父级菜单")
    private Integer parentId;

    @ApiModelProperty(value = "菜单标题")
    private String title;

    @ApiModelProperty(value = "菜单路径")
    private String path;

    @ApiModelProperty(value = "菜单图标")
    private String icon;


}
