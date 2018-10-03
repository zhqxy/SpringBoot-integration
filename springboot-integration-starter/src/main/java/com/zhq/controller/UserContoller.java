package com.zhq.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zhq.pojo.JSONResult;
import com.zhq.pojo.User;

//@Controller
@RestController		// @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserContoller {

	@RequestMapping("/getUser")
//	@ResponseBody
	public User getUser() {
		
		User u = new User();
		u.setName("zhq2");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("zhq2");
		u.setDesc("hello zhq2~~");
		
		return u;
	}
	
	@RequestMapping("/getUserJson")
//	@ResponseBody
	public JSONResult getUserJson() {
		
		User u = new User();
		u.setName("zhq");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("zhq");
		u.setDesc("hello zhq~~hello zhq~~");
		
		return JSONResult.ok(u);
	}
}
