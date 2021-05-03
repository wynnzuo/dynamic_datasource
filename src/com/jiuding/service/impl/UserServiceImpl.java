package com.jiuding.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiuding.mapper.UserMapper;
import com.jiuding.pojo.User;
import com.jiuding.service.UserService;

/**
* @ClassName:UesrServiceImpl
* @date 2017年7月14日
*/
@Service
public class UserServiceImpl implements UserService {
	
	//自动装配 @Autowired 默认按照类型注入,@Resource先按照名称注入，如果名称找不到，找type。
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAll() {
		return userMapper.selAll();
	}
	@Override
	public int insUser(User user) {
		return userMapper.insUser(user);
	}

}
