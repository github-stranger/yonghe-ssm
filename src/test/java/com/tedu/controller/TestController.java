package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;

/**
 * 
 * @author Administrator
 *
 */
@Controller
public class TestController {

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/hello") 
	public String testHello() {
		System.out.println("Hello SpingMvc");
		return "door_add";	
	}
	

	/*由于前面在spring的配置文件中配置的接口扫描器，spring会dao包下的所有接口提供实现类，
	也会创建实现类在根据类型匹配，将创建好的DOORMAPPER接口的实例，赋值给dao变量*/
	@Autowired
	private DoorMapper dao;
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/testssm")
	public String testssm() {
		
		System.out.println("SSM环境测试...");
		//查询所有门店信息
		List<Door> list = dao.findAll();
		for (Door door : list) {
			System.out.println(door);
		}
		return "door_add";	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//
}
