package ksmart30.team02.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import ksmart30.team02.account.domain.Slip;
import ksmart30.team02.account.service.SlipService;
@Controller
public class SlipController {
@Autowired
SlipService slipService;
	//전표입력폼, slip_in.html 화면 출력
	@GetMapping("/acc/slipView")
	public String slipView() {
		System.out.println("전표입력 slipIn SlipController.java");
		return "/account/slip/slip_in";
	}
	//조회버튼클릭시 리스트 출력, SlipService객체 내 slipList메서드 호출, 리턴값 화면에 리턴
	@GetMapping("/account/slip/slip_in/search")
	public @ResponseBody List<Slip> slipList() throws JsonProcessingException{
		System.out.println("01 /account/slip/slip_in/search");
		List<Slip> slip = slipService.slipList();
		/* List<Slip> slip = slipService.slipList(); */
		return slip;
	}
	
}
