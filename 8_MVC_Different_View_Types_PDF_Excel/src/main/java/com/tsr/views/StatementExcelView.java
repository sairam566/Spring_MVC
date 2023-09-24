package com.tsr.views;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.tsr.dto.TransactionDto;

public class StatementExcelView extends AbstractXlsView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<TransactionDto> transactionDtos = null;
		TransactionDto dto = null;
		Sheet sheet = null;
		Row row = null;

		transactionDtos = (List<TransactionDto>) model.get("transactions");
		sheet = workbook.createSheet("statement");

		for (int i = 0; i < transactionDtos.size(); i++) {
			dto = transactionDtos.get(i);
			row = sheet.createRow(i);
			Cell cell0 = row.createCell(0);
			cell0.setCellValue(dto.getTransactionDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			Cell cell1 = row.createCell(1);
			cell1.setCellValue(dto.getTransactionRefNo());
			Cell cell2 = row.createCell(2);
			cell2.setCellValue(dto.getAmount());
			Cell cell3 = row.createCell(3);
			cell3.setCellValue(dto.getTransactionType());
		}
	}
}
