package com.cafe24.ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SlipController {
	//전표입력
	@GetMapping("/acc/slip/in")
	public String slipIn() {
		System.out.println("전표입력 slipIn SlipController.java");
		return "/account/slip/slip_in";
	}
	
}
