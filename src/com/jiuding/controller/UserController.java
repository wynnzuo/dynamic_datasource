package com.jiuding.controller;

import com.jiuding.pojo.User;
import com.jiuding.service.UserService;
import com.jiuding.utils.DataSourceContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
* @ClassName:UserController
*/
@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("findAll")
	@ResponseBody
	public List<User> findAll(){
		List<User> list = userService.findAll();
		return list;
	}
	@RequestMapping("insert")
	public String insertUser(){
		User user = new User();
		user.setUsername("admin");
		user.setPwd("123456");
		user.setId(11);

		// 注意这里在调用service前切换到productDataSource的数据源
		DataSourceContextHolder.setDbType("ds2");
		userService.insUser(user);
		return "list";
	}
}
