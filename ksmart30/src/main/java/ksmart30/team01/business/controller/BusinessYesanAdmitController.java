package ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessYesanAdmitController {
	@GetMapping("/business/businessYesanAdmitView")
	public String businessYesanAdmitView() {
		return "/business/businessYesanAdmitView";
	}
}