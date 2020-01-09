package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.OrderMapper;
import com.tedu.pojo.Order;

/**
 * 订单管理
 * @author Administrator
 *
 */
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderMapper orderMapper;

	/**
	 * 订单信息
	 */
	@Override
	public List<Order> selectOrder() {
		List<Order> list = orderMapper.selectOrder();
		return list;
	}

	/**
	 * 新增订单
	 */
	@Override
	public void addOrder(Order order) {
		orderMapper.addOrder(order);
		
	}
	
	/**
	 * 删除订单
	 */
	@Override
	public void deleteOrder(Integer id) {
		orderMapper.deleteOrder(id);
		
	}

	/**
	 * BYID查询订单信息
	 */
	@Override
	public Order ByIdOrder(Integer id) {
		Order order = orderMapper.ByIdOrder(id);
		return order;
	}

	/**
	 * 修改订单信息
	 */
	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		orderMapper.updateOrder(order);
	}
	
}
