package ksmart30.team02.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PurchaseDebtController {
	@GetMapping("/acc/purchasedebt/in")
	public String purchaseDebt() {
		return "account/slip/purchasedebt/purchase_debt";
	}
}
