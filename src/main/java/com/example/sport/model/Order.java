package com.example.sport.model;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

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
@TableName("order")
@ApiModel(value="Order对象", description="")
public class Order implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "订单编号(雪花算法生成)")
    private Long id;

    @ApiModelProperty(value = "商品ID")
    private Integer goodsId;

    @ApiModelProperty(value = "下单时间")
    private Date createTime;

    @ApiModelProperty(value = "下单人ID")
    private Integer userId;

    @ApiModelProperty(value = "订单状态 0待支付、1已支付、2已取消")
    private Integer state;

    @ApiModelProperty(value = "备注")
    private String remark;


}
