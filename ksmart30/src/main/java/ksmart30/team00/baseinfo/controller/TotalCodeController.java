package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TotalCodeController {
	@GetMapping("/baseinfo/totalcode/in")
	public String totalCode() {
		return "baseInfo/totalcode";
	}
}
