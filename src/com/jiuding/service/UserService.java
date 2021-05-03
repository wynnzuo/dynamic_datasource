package com.jiuding.service;

import java.util.List;

import com.jiuding.pojo.User;

/**
* @ClassName:UserService
* @date 2017年7月14日
*/

public interface UserService {
	List<User> findAll();
	int insUser(User user);
}
