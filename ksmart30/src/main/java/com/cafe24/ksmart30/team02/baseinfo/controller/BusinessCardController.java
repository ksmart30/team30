package com.cafe24.ksmart30.team02.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessCardController {
	//기업카드
	@GetMapping("/baseinfo/businesscard/in")
	public String businessCardController() {
		System.out.println("기업카드 businessCardController ControlItemCodeController.java");
		
		return "baseinfo/businessCard/businessCard";
	}
}
