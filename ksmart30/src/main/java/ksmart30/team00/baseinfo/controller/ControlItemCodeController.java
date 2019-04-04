package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team00.baseinfo.service.ControlItemCodeService;
import ksmart30.team00.baseinfo.domain.ControlItemCode;

@Controller
public class ControlItemCodeController {
@Autowired
ControlItemCodeService controlItemCodeService;
	//관리항목코드폼, ControlItemCodeService내 ControlItemCodeList메서드 호출, 리턴값 Model영역에 세팅, controlitemcode화면 출력.
	@GetMapping("/baseInfo/controlItemView")
	public String controlItemView(Model model) {
		System.out.println("01 관리항목코드등록 ControlItemCode ControlItemCodeController.java");
		List<ControlItemCode> controlItemCode = controlItemCodeService.ControlItemCodeList();
		System.out.println("controlItemCode : " + controlItemCode);
		model.addAttribute("controlItemCode", controlItemCode);
		return "baseinfo/controlitemcode/controlitemcode";
	}
}
