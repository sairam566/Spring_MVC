package com.tsr.controllers;

import javax.validation.groups.Default;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.tsr.form.LoanApplicationForm;
import com.tsr.validator.LoanInfoGroup;

@Controller
@RequestMapping("/loanApplication")
@SessionAttributes({ "loanApplicationForm" })
public class LoanApplicationController {

	@GetMapping("/applicant-info.htm")
	public String showApplicationInfoPage(ModelMap modelMap) {
		LoanApplicationForm loanApplicationForm = new LoanApplicationForm();
		modelMap.addAttribute("loanApplicationForm", loanApplicationForm);
		return "applicant-info";
	}

	@PostMapping("/applicant-info.htm")
	public String processAndShowNext(@ModelAttribute("loanApplicationForm") @Validated(value = {
			Default.class }) LoanApplicationForm loanApplicationForm, BindingResult errors, ModelMap modelMap) {
		if (errors.hasErrors()) {
			return "applicant-info";
		}

		return "apply-loan";
	}

	@PostMapping("/apply-loan.htm")
	public String applyLoan(
			@ModelAttribute("loanApplicationForm") @Validated(value = {
					LoanInfoGroup.class }) LoanApplicationForm loanApplicationForm,
			BindingResult errors, ModelMap modelMap, SessionStatus status) {
		
		if (errors.hasErrors()) {
			return "apply-loan";
		}
		System.out.println(loanApplicationForm);
		status.setComplete();
		modelMap.addAttribute("referenceNo","12W12344");
		return "loan-configuration";
	}
}
