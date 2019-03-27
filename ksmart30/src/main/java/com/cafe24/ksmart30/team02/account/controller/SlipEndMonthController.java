package com.cafe24.ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SlipEndMonthController {

		//전표마감(월)
		@GetMapping("/acc/slipendmonth/in")
		public String slipEndMonthIn() {
			System.out.println("전표마감 (월) slipEndMonthIn SlipEndDayController.java");
			return "/account/slip/endmonth/slipendmonth_in";
		}
	}


