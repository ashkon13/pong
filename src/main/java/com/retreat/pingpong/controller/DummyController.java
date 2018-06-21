package com.retreat.pingpong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pong")
public class DummyController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	   public String findAll() {
	       return "Hey pingpong";
	   }

	
}
