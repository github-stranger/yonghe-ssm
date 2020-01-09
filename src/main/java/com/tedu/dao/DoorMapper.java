package com.tedu.dao;

import java.util.List;

import com.tedu.pojo.Door;

public interface DoorMapper {

	
	/**
	 * 查询门店信息
	 * @return
	 */
	public List<Door> findAll();
	
	/**
	 * 新增门店信息
	 */
	public void addDoor(Door door);
	
	/**
	 * 删除门店信息
	 */
	public void deleteDoor(Integer id);
	
	/**
	 * BYID查询门店信息
	 */
	public Door ByIdselect(Integer id);
	
	/**
	 * 修改门店信息
	 */
	public void updateDoor(Door door);
}
