package com.example.simple.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.simple.model.Simple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
class SimpleController {

    @GetMapping("/")
	public String home()  {
		
		log.info("==========simple home()");
	 
		
		return "hello world";
		
	}
	@GetMapping("/hello")
	public List<Simple> listBoard(){
		List<Simple> list = new ArrayList<>();
		
		for(int i=0 ; i< 10;i++) {
			list.add(new Simple(i+1,"test-"+i, "contents-"+i));
			System.out.println("for "+i);
		}
		log.info(list.toString());
		return list;
		
	}
	
	@GetMapping("/version")
	public String version(){
		//log.info("version 6.0");
		return "=====  version: v5.0.5 !!!";
		
	}

	@GetMapping("/healthz")
	public String healthz() {
		
		return "hello system lives";
		
	}

    
}