package ksmart30.team01.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team01.business.service.BusinessYesanInputService;

@Controller
public class BusinessYesanInputController {
	@Autowired BusinessYesanInputService businessYesanInputService;
	
	@GetMapping("/business/businessYesanView")
	public String businessYesanView(Model model) {
		model.addAttribute("list", businessYesanInputService.getDeptList());
		return "/business/businessYesanView";
	}
}
