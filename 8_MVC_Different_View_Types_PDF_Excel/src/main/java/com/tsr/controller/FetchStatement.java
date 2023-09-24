package com.tsr.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.tsr.dto.TransactionDto;

public class FetchStatement extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String viewName = null;
		String viewType = null;
		List<TransactionDto> transactions = null;
		ModelAndView mav = null;
		LocalDate fromDate = null;
		LocalDate toDate = null;
		String accountNo = null;

		fromDate = LocalDate.parse(request.getParameter("fromDate"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		toDate = LocalDate.parse(request.getParameter("toDate"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		accountNo = request.getParameter("accountNo");
		viewType = request.getParameter("viewType");
		
		// query the data from database
		transactions = new ArrayList<TransactionDto>();
		TransactionDto transactionDto = new TransactionDto("8837/ak3nkdi/99",
		LocalDate.of(fromDate.getYear(), fromDate.getMonth(), fromDate.getDayOfMonth() + 2), 230, "CR");
		transactions.add(transactionDto);

		transactionDto = new TransactionDto("3893/ljldfoasdfa",
		LocalDate.of(fromDate.getYear(), fromDate.getMonth(), fromDate.getDayOfMonth() + 3), 2230, "CR");
		transactions.add(transactionDto);

		transactionDto = new TransactionDto("3893o983ojd",
		LocalDate.of(fromDate.getYear(), fromDate.getMonth(), fromDate.getDayOfMonth() + 3), 12230, "CR");
		transactions.add(transactionDto);
		
		transactionDto = new TransactionDto("998989928/2ladiukn",
		LocalDate.of(fromDate.getYear(), fromDate.getMonth(), fromDate.getDayOfMonth() + 13), 223, "DR");
		transactions.add(transactionDto);

		mav = new ModelAndView();
		mav.addObject("fromDate", fromDate);
		mav.addObject("toDate", toDate);
		mav.addObject("accountNo", accountNo);
		mav.addObject("transactions", transactions);
		
		if (viewType != null) {
			if (viewType.equals("pdf")) {
				viewName = "account-statement-pdf";
			} else if (viewType.equals("xls")) {
				viewName = "account-statement-xls";
			}
		} else {
			viewName = "account-statement";
		}

		mav.setViewName(viewName);

		return mav;
	}

}
