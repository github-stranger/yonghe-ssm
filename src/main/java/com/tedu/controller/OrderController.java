package com.tedu.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;
import com.tedu.pojo.Order;
import com.tedu.service.OrderService;

/**
 * 订单管理
 * @author Administrator
 *
 */
@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private DoorMapper doorMapper;
	/**
	 * 订单信息
	 */
	@RequestMapping("/orderList")
	public String orderList(Model model) {
		//Door
		List<Door> doorlist =doorMapper.findAll();
		model.addAttribute("doorlist", doorlist);
		
		//Order
		List<Order> orderlist = orderService.selectOrder();
		model.addAttribute("orderlist", orderlist);
		return "order_list";
		
	}
	
	/**
	 * 添加门店信息到order_add.jsp
	 */
	@RequestMapping("/doorId")
	public String doorId(Model model) {
		//Door
		List<Door> doorlist =doorMapper.findAll();
		model.addAttribute("doorlist", doorlist);
		return "order_add";		
	}
	/**
	 * 新增订单
	 */
	@RequestMapping("/orderAdd")
	public String orderAdd(Order order) {
		orderService.addOrder(order);
		
		return "redirect:/orderList";	
	}
	
	/**
	 * 删除订单信息
	 */
	@RequestMapping("/orderDelete")
	public String orderDelete(Integer id) {
		orderService.deleteOrder(id);
		return "redirect:/orderList";	
	}
	
	/**
	 * BYID查询订单信息
	 */
	@RequestMapping("/orderInfo")
	public String orderInfo(Integer id,Model model) {
		//Door
		List<Door> doorlist =doorMapper.findAll();
		model.addAttribute("doorlist", doorlist);
		
		//Order
		Order order = orderService.ByIdOrder(id);
		model.addAttribute("order", order);
		return "order_update";	
	}
	
	/**
	 * 修改订单信息
	 */
	@RequestMapping("/orderUpdate")
	public String orderUpdate(Order order) {
		orderService.updateOrder(order);
		
		return "redirect:/orderList";
		//forward(转发)
		//redirect(重定向)
	}
}
