package ksmart30.team01.business.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team01.business.service.BusinessYesanInputService;

@Controller
public class BusinessYesanInputController {
	@Autowired BusinessYesanInputService businessYesanInputService;
	
	@GetMapping("/business/businessYesanView")
	public String businessYesanView(Model model) {
		model.addAttribute("list", businessYesanInputService.getDeptList());
		return "/business/businessYesanView";
	}
	
	@PostMapping("/businessYesanGetProjectList")
	public @ResponseBody List<Map<String, String>> businessYesanGetProjectList(@RequestBody Map<String,Object> searchMap){
		
		return businessYesanInputService.getProjectList(searchMap);
	}
	
	@PostMapping("/businessYesanGetResultProjectList")
	public @ResponseBody List<Map<String,String>> businessYesanGetResultProjectList(@RequestBody Map<String,Object> searchMap){
		System.out.println(searchMap.toString());
		return businessYesanInputService.getResultProjectList(searchMap);
	}
	
	@PostMapping("/businessYesanGetResultEmpList")
	public @ResponseBody List<Map<String,String>> businessYesanGetResultEmpList(@RequestBody Map<String,Object> searchMap){
		System.out.println(searchMap.toString());
		
		return businessYesanInputService.getResultDeptList(searchMap);
	}
	
	@PostMapping("/businessYesanGetResultProject")
	public @ResponseBody Map<String,Object> businessYesanGetResultProject(@RequestBody String PJT_CD){
		System.out.println(PJT_CD);
		return businessYesanInputService.getResultProject(PJT_CD);
	}
}
