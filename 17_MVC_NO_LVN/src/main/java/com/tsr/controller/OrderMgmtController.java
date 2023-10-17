package com.tsr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderMgmtController {

	@GetMapping("/return-order.htm")
	public void returnOrder(@RequestParam("orderNo") String orderNo, Model model) {
		// update the order status in the db to "returned"
		// invoke PaymentService to process the refund
		model.addAttribute("orderNo", orderNo);
	}
}
