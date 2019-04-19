package ksmart30.team01.business.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team01.business.domain.Business;
import ksmart30.team01.business.domain.BusinessSearch1;
import ksmart30.team01.business.service.BusinessYesanSearchService;

@Controller
public class BusinessYesanSearchController {
	@Autowired
	BusinessYesanSearchService businessYesanSearchService;
	//사업성검도 검색1 화면
	@GetMapping("/business/businessYesanSearch1View")
	public String businessYesanSearch1View(Model model) {
		List<Map<String, String>> searchDept = businessYesanSearchService.businessOutputSearch1Dept();
		model.addAttribute("searchDept", searchDept);
		return "/business/businessYesanSearch1View";
	}
	//사업성검토 검색2 화면
	@GetMapping("/business/businessYesanSearch2View")
	public String businessYesanSearch2View() {
		return "/business/businessYesanSearch2View";
	}
	//사업성검토 검색1
	@GetMapping("/businessYesanSearchView")
	public @ResponseBody List<BusinessSearch1> businessOutputSearch1(BusinessSearch1 businessSearch1){
		System.out.println("사업성코드 검색1 깐뜨롤라 businessOutputSearch1 BusinessYesanOutputControlle.java");
		List<BusinessSearch1> searchList1 = businessYesanSearchService.businessOutputSearch1(businessSearch1);
		return searchList1;
	}
	//사업성검토 검색1 (프로젝트코드 팝업전체리스트)
	@GetMapping("/businessPjtCd")
	public @ResponseBody List<BusinessSearch1> businessPjtCd(BusinessSearch1 businessSearch1){
		System.out.println("사업성검토 검색1 (프로젝트코드 팝업전체리스트) 깐뜨롤라 businessOutputSearch1 BusinessYesanOutputControlle.java");
		System.out.println(businessSearch1+"<--코드받아왔나연");
		List<BusinessSearch1> pjtCd = businessYesanSearchService.businessPjtCd(businessSearch1);
		
		return pjtCd;
	}
	//사업성검토 검색2
	@GetMapping("/businessYesanSearch2View")
	public @ResponseBody List<Business> businessOutputSearch2(Business business){
		System.out.println("사업성코드 검색2 깐뜨롤라 businessOutputSearch2 BusinessYesanOutputControlle.java");
		List<Business> searchList = businessYesanSearchService.businessOutputSearch2(business);
		return searchList;
	}
}
