package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team00.baseinfo.service.AssetClassifyCodeService;
import ksmart30.team00.baseinfo.domain.AssetClassifyCode;

@Controller
public class AssetClassfyCodeController {
@Autowired
AssetClassifyCodeService assetClassifyCodeService;
	//자산분류코드폼, ControlItemCodeList내 assetClassifyCodeList메서드 호출, 리턴값 Model영역에 세팅, assetclassfycode화면 출력
	@GetMapping("/baseInfo/assetClassifyView")
	public String assetClassifyView(Model model) {
		System.out.println("01 자산분류코드 AssetClassfyCode AssetClassfyCodeController.java");
		List<AssetClassifyCode> assetClassifyCode = assetClassifyCodeService.assetClassifyCodeList();
		System.out.println("assetClassifyCode : " + assetClassifyCode);
		model.addAttribute("assetClassifyCode", assetClassifyCode);
		return "baseinfo/assetclassfycode/assetclassfycode";
	}
}
