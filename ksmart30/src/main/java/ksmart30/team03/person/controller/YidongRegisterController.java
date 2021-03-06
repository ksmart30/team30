package ksmart30.team03.person.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart30.team03.person.domain.Yidong;
import ksmart30.team03.person.domain.YidongSearch;
import ksmart30.team03.person.service.YidongRegisterService;
@Controller
public class YidongRegisterController {
	@Autowired YidongRegisterService yidongRegisterService;
	
	//화면출력, 인사발령대장 list 출력
	@GetMapping("/person/personYidongRegisterView")
	public String personYidongRegisterView(Model model) {
		System.out.println("personYidongRegisterView 메서드 호출 컨트롤러");
		List<Yidong> result = yidongRegisterService.getYidongRegister();
		model.addAttribute("registerList", result);
		//리스트 잘나오는지 확인하자
		System.out.println("인사발령대장 list 값 : "+result);
		return "person/yidong/registerListView";
	}
	//인사발령대장 검색 list 출력
	@GetMapping("/person/personYidongRegisterSearch")
	public @ResponseBody List<Map<String,Object>> registerSearch(YidongSearch vo) {
		System.out.println("인사발령대장 검색 list 출력");
		System.out.println("검색 입력값 : "+vo);
		List<Map<String,Object>> data = yidongRegisterService.searchYidongRegister(vo);
		System.out.println("검색 출력 list : "+data);
		
		return data;
	}
}
