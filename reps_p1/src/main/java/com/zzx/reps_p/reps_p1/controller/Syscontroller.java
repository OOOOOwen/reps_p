package com.zzx.reps_p.reps_p1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Syscontroller {
	
	@RequestMapping("/getinfoes")
	public Object getinfoes(){
		return "hello world ... 一二三四";
	}
	
	
}
