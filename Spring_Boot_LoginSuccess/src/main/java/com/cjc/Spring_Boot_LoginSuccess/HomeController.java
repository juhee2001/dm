package com.cjc.Spring_Boot_LoginSuccess;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    int a;
	int b;
	@GetMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	@GetMapping("/log")
	public String log()
	{
		return "success";
	}
}
