package ksmart30.team01.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team01.business.service.BusinessYesanAdmitService;


@Controller
public class BusinessYesanAdmitController {
	@Autowired
	BusinessYesanAdmitService businessYesanAdmitService; 
	
	@GetMapping("/business/businessYesanAdmitView")
	public String businessYesanAdmitView(Model model) {	
		model.addAttribute("list", businessYesanAdmitService.getDeptList());
		return "/business/businessYesanAdmitView";
	}
}
