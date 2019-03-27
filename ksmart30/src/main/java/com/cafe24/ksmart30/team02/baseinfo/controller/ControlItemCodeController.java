package com.cafe24.ksmart30.team02.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControlItemCodeController {
	//관리항목코드등록
	@GetMapping("/baseinfo/controlitemcode/in")
	public String ControlItemCode() {
		System.out.println("관리항목코드등록 ControlItemCode ControlItemCodeController.java");
		return "baseinfo/controllitemcode/controllitemcode";
	}
}
