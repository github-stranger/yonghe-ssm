package com.tedu.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;
import com.tedu.service.DoorService;

/**
 * 门店管理
 * @author Administrator
 *
 */
@Controller
public class DoorController {


	/*由于前面在spring的配置文件中配置的接口扫描器，spring会dao包下的所有接口提供实现类，
	也会创建实现类在根据类型匹配，将创建好的DOORMAPPER接口的实例，赋值给dao变量*/
	@Autowired
	private DoorService doorService;

	/**
	 * 通用的页面跳转方法
	 * 跟据jsp页面的名字跳转到指定的将jsp页面
	 */
	@RequestMapping("/{page}")
	public String pages(@PathVariable String page) {
		return page;
		
	}
	
	/**
	 * 查询所有门店信息
	 * @return
	 */
	@RequestMapping("/doorList")
	public String doorList(Model model) {
		List<Door> doorlist = doorService.findAll();
		
		//将所有门店信息的list集合存入model中，带到JSP显示
		model.addAttribute("doorlist", doorlist);
		
		return "door_list";				
	}
	
	/**
	 * 新增门店信息
	 */
	@RequestMapping("/doorAdd")
	public String doorAdd(Door door) {
		doorService.addDoor(door);
		return "redirect:/doorList";
	}
	
	/**
	 * 删除门店信息
	 */
	@RequestMapping("/doorDelete")
	public String doorDelete(Integer id) {
		doorService.deleteDoor(id);
		
		return "redirect:/doorList";	
	}
	
	/**
	 * BYID查询门店信息
	 */
	@RequestMapping("/doorInfo")
	public String doorInfo(Integer id,Model model ) {
		Door door = doorService.ByIdselect(id);
		model.addAttribute("door", door);
		return "door_update";		
	}
	
	/**
	 * 修改门店信息
	 */
	@RequestMapping("/doorUpdate")
	public String doorUpdate(Door door) {
		doorService.updateDoor(door);
		
		return "redirect:/doorList";
		
	}
	
	
	//
}
