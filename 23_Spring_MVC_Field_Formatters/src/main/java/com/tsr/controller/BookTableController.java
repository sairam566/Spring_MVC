package com.tsr.controller;

import java.util.UUID;

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

import com.tsr.dto.BookingDto;
import com.tsr.form.BookTableForm;
import com.tsr.validator.BookTableFormValidator;

@Controller
@RequestMapping("/bookTable.htm")
public class BookTableController {
	
	private BookTableFormValidator bookTableFormValidator;
	
	@InitBinder
	public void webBinder(WebDataBinder dataBinder) {
		dataBinder.addValidators(bookTableFormValidator);
	}
	
	@GetMapping
	public String showBookTableForm(ModelMap modelMap) {
		BookTableForm bookTableForm = new BookTableForm();
		modelMap.addAttribute("bookTableForm", bookTableForm);
		return "book-table";
	}
	
	@PostMapping
	public String BookTable(@ModelAttribute("bookTableForm") @Valid BookTableForm bookTableForm, BindingResult errors, ModelMap modelMap) {
		if(errors.hasErrors()) {
			return "book-table";
		}
		
		BookingDto bookingDto = BookingDto.builder()
				.referenceNo(UUID.randomUUID().toString())
				.contactPerson("Jon")
				.contactNo("1234567")
				.restaurantName(bookTableForm.getRestaurantName())
				.bookingDateTime(bookTableForm.getReservationDate())
				.coupon(bookTableForm.getCoupon())
				.build();
		modelMap.addAttribute("booking", bookingDto);
		return "Table-Details";
	}
}
