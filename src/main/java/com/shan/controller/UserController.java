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
		System.out.println("e2提交");
        System.out.println("idea提交2");
		System.out.println("e2提交2");
		return map;
	}
	
	 public static void main(String[] args){
	  System.out.println("idea");
	}
	
}
