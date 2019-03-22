package com.cafe24.ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UnpaidController {
	@GetMapping("/account/unpaid/in_form")
	public String slipAdmitIn() {
		return "/account/unpaid/unpaid_in";
	}
}
