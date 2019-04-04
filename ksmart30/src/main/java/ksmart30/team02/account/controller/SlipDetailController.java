package ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SlipDetailController {
	
	@GetMapping("/acc/slipSearchView")
	public String slipSearchView() {
		return "account/slip/search/slipdetail_search";
	}
}
