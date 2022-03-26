package com.example.sport.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sport.mapper.OrderMapper;
import com.example.sport.model.Order;
import com.example.sport.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XuShu
 * @since 2022-03-26
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
