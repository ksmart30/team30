package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GapgeunseController {
	@GetMapping("/baseInfo/gapguenseView")
	public String gapguenseView() {
		return "index";
	}
}
