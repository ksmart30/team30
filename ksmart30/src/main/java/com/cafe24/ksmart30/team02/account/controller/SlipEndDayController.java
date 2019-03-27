package com.cafe24.ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SlipEndDayController {
	//전표마감(일)
	@GetMapping("/acc/slipendday/in")
	public String slipEndDayIn() {
		System.out.println("전표마감(일) slipEndDayIn SlipEndDayController.java");
		return "/account/slip/endday/slipendday_in";
	}
}