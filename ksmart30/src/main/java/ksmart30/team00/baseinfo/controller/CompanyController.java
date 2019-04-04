package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {

	@GetMapping("/baseInfo/company")
	public String companySearch() {
		return "baseInfo/company";
	}
}
