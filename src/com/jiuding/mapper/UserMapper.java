package com.jiuding.mapper;

import java.util.List;

import com.jiuding.pojo.User;

/**
* @ClassName:UserMapper
*/

public interface UserMapper {
	List<User> selAll();
	int insUser(User user);
}
