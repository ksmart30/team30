package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BankAccountController {
	//통장계좌
	@GetMapping("/baseInfo/bankAccountView")
	public String bankAccountView() {
		return "baseInfo/bankaccount";
	}
}
