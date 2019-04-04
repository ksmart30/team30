package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ksmart30.team00.baseinfo.service.AccountCodeService;
import ksmart30.team00.baseinfo.domain.AccountCode;

@Controller
public class AccountCodeController {
	@Autowired
	AccountCodeService accountcodeservice;
	//계정과목코드폼, AccountCodeService내 AccountCodeList메서드 호출, 리턴값 Model영역에 세팅, accountcode_in화면 출력
	@GetMapping("/baseInfo/accountCodeView")
	public String accountCodeView(Model model){
		
		  System.out.println("계정과목코드 리스트 AccountCodeInsert AccountCodeController.java"
		  );
		  
		  List<AccountCode> list = accountcodeservice.getAccountCodeList();
		  model.addAttribute("list",list); System.out.println(list +
		  "list AccountCodeInsert AccountCodeController.java");
		 
		
		return "/baseinfo/accountcode/accountcode_in";
	}
	//리스트 클릭시 상세내용 출력, AccountCodeService내 AccountCodeDetailList메서드 호출, 리턴값 slip_in.html으로 리턴.
	@GetMapping("/baseinfo/accountcode/in/detail")
	public @ResponseBody AccountCode AccountCodeDetailList() {
		System.out.println("01 단위테스트");
		
		return null;
	}
}
