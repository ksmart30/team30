package com.cafe24.ksmart30.team02.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepreciationController {
	@GetMapping("/baseinfo/depreciation/in")
	public String depriciation() {
		return "baseInfo/depreciation_in";
	}
}
