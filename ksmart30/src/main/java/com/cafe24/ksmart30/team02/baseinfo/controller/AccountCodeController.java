package com.cafe24.ksmart30.team02.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountCodeController {
	@GetMapping("/baseinfo/accountcode/in")
	public String AccountCodeInsert(){
		return "/baseinfo/accountcode/accountcode_in";
	}

}
