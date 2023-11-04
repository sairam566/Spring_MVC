package com.tsr.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tsr.dto.AccountDto;
import com.tsr.form.AccountForm;
import com.tsr.validator.OpenAccountFormValidator;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	private OpenAccountFormValidator openAccountFormValidator;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(openAccountFormValidator);
	} 

	@GetMapping("/new.htm")
	public String showOpenAccountForm(ModelMap modelMap) {
		AccountForm openAccountForm = new AccountForm();
		modelMap.addAttribute("openAccountForm", openAccountForm);
		return "open-account";
	}

	@PostMapping("new.htm")
	public String registerAccount(@ModelAttribute("openAccountForm") @Valid AccountForm openAccountForm, BindingResult errors,
			ModelMap modelMap) {
		if (errors.hasErrors()) {
			return "open-account";
		}
		AccountDto accountDto = AccountDto.builder().accountNo("AC2345678")
				.accountHolderName(openAccountForm.getFirstName() + " " + openAccountForm.getLastName()).balance(1000)
				.status("active").build();
		modelMap.addAttribute("account", accountDto);
		return "account-details";
	}
}
