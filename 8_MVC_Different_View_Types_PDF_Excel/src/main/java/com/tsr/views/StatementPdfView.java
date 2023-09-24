package com.tsr.views;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.tsr.dto.TransactionDto;

public class StatementPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<TransactionDto> transactionDtos = null;
		TransactionDto dto = null;
		Table table = null;

		transactionDtos = (List<TransactionDto>) model.get("transactions");
		table = new Table(4);
		for(int i=0;i<transactionDtos.size();i++) {
			dto = transactionDtos.get(i);
			table.addCell(dto.getTransactionDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			table.addCell(dto.getTransactionRefNo());
			table.addCell(String.valueOf(dto.getAmount()));
			table.addCell(dto.getTransactionType());
		}
		document.add(table);
	}

}

























