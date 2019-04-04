package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessCardController {
	//기업카드
	@GetMapping("/baseInfo/businessCardView")
	public String businessCardView() {
		System.out.println("기업카드 businessCardController ControlItemCodeController.java");
		
		return "baseInfo/businessCard/businessCard";
	}
}
