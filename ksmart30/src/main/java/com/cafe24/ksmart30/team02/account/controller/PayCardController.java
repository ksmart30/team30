package com.cafe24.ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayCardController {
	@GetMapping("/acc/paycard/in")
	public String paycard() {
		return "account/slip/paycard/paycard_in";
	}
}
