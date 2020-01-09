package com.tedu.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;

/**
 * 测试Mybatis运行环境
 * @author Administrator
 *
 */
public class TestMybatis {

	
	public static void main(String[] args) throws Exception  {
		//1.读取mybatis-config.xml文件
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		//2.获取SqlSessionfactory工厂对象
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		//3.获取SqlSession对象
		SqlSession session = build.openSession();
		//4.执行查询门店sql
		DoorMapper door = session.getMapper(DoorMapper.class);
		List<Door> list = door.findAll();	
		//5.输出结果
		for (Door d : list) {
			System.out.println(d);
		}
		
	}

	
}
