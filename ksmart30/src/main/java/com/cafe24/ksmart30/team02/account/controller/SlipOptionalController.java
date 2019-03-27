package com.cafe24.ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SlipOptionalController {

	@GetMapping("/acc/conditionalslip/search/in")
	public String slipOptional(){
		
		return "account/slip/search/slipotional_search"; 
	}
}
