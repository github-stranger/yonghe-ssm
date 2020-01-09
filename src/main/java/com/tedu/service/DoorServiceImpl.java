package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;

/* @Service作用1： 将当前对象的创建交给spring管理
 * 作用2：作为业务层代码的标识
 */
@Service
public class DoorServiceImpl implements DoorService {

	@Autowired
	private DoorMapper doorMapper;

	/**
	 * 查询所有门店信息
	 */
	@Override
	public List<Door> findAll() {
		List<Door> list = doorMapper.findAll();
		return list;
	}

	/**
	 * 新增门店信息
	 */
	@Override
	public void addDoor(Door door) {
		// TODO Auto-generated method stub
		doorMapper.addDoor(door);
	}

	/**
	 * 删除门店信息
	 */
	@Override
	public void deleteDoor(Integer id) {
		doorMapper.deleteDoor(id);
		
	}

	/**
	 * BYID查询门店信息
	 */
	@Override
	public Door ByIdselect(Integer id) {
		Door door = doorMapper.ByIdselect(id);
		return door;
	}

	/**
	 * 修改门店信息
	 */
	@Override
	public void updateDoor(Door door) {
		doorMapper.updateDoor(door);
		
	}
	
	
}
