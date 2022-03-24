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
 * 
 * </p>
 *
 * @author XuShu
 * @since 2022-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("goods")
@ApiModel(value="Goods对象", description="")
public class Goods implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private Float price;

    private Integer number;

    private Date createTime;

    private Integer createUserId;

    @ApiModelProperty(value = "图片地址")
    private String imageUrl;

    @ApiModelProperty(value = "适配机型")
    private String modelType;

    @ApiModelProperty(value = "控制方式")
    private String controlMode;

    @ApiModelProperty(value = "主要功能")
    private String mainFunction;

    @ApiModelProperty(value = "无线功能")
    private String wifiFunction;

    @ApiModelProperty(value = "电池规格")
    private String battery;

    @ApiModelProperty(value = "特色功能")
    private String characteristic;

    @ApiModelProperty(value = "外观尺寸")
    private String size;

    @ApiModelProperty(value = "其他功能")
    private String other;

    @ApiModelProperty(value = "备注")
    private String remark;


}
