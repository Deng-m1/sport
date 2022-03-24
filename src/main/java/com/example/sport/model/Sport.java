package com.example.sport.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 运动表
 * </p>
 *
 * @author XuShu
 * @since 2022-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sport")
@ApiModel(value="Sport对象", description="运动表")
public class Sport implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "运动名称")
    private String name;

    @ApiModelProperty(value = "使用年龄")
    private String applicableAge;

    @ApiModelProperty(value = "收益部位(身体)")
    private String beneficialPosition;

    @ApiModelProperty(value = "简介(对该运动的描述)")
    private String introduction;


}
