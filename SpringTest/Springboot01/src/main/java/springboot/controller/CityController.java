package cn.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class CityController {

	@RequestMapping("user")
	@ResponseBody
	public String test() {
		return "hello world";
	}
}
