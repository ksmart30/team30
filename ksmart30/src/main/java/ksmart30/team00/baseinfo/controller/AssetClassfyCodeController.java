package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AssetClassfyCodeController {
	
	//자산분류 코드
	@GetMapping("/baseinfo/assetclassifycode/in")
	public String AssetClassfyCode() {
		System.out.println("자산분류코드 AssetClassfyCode AssetClassfyCodeController.java");
		return "baseInfo/assetclassfycode/assetclassfycode";
	}
}
