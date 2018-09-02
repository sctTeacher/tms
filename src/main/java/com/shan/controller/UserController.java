package com.shan.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	@RequestMapping("/loing")
	public Map loing(){
		Map map=new HashMap<>();
		map.put("id", 1);
		map.put("name", "张三");
		return map;
	}
}
