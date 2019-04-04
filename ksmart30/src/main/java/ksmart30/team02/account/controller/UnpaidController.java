package ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UnpaidController {
	@GetMapping("/acc/unpaidView")
	public String unpaidView() {
		return "/account/unpaid/unpaid_in";
	}
}
