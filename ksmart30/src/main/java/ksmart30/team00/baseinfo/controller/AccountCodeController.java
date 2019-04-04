package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountCodeController {
	@GetMapping("/baseinfo/accountcode/in")
	public String AccountCodeInsert(){
		return "/baseInfo/accountcode/accountcode_in";
	}

}
