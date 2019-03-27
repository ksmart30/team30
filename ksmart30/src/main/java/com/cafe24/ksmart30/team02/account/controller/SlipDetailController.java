package com.cafe24.ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SlipDetailController {
	
	@GetMapping("/acc/slip/search/in")
	public String slipDetailSearch() {
		return ("account/slip/search/slipdetail_search.html");
	}
}
