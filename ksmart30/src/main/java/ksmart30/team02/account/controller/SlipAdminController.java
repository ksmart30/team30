package ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SlipAdminController {
	//전표승인
	@GetMapping("/acc/slipAdmitView")
	public String slipAdmitView() {
		return "/account/slip/admit/slipadmit_in";
	}
}
