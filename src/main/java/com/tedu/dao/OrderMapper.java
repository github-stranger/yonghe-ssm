package com.tedu.dao;

import java.util.List;

import com.tedu.pojo.Order;

/**
 * 订单管理
 * @author Administrator
 *
 */
public interface OrderMapper {

	/**
	 * 订单信息
	 * @return
	 */
	public List<Order> selectOrder();
	
	/**
	 * 新增订单
	 */
	public void addOrder(Order order);
	
	/**
	 * 删除订单
	 */
	public void deleteOrder(Integer id);
	
	/**
	 * BYID查询订单信息
	 */
	public Order ByIdOrder(Integer id);
	
	/**
	 * 修改订单信息
	 */
	public void updateOrder(Order order);
}
