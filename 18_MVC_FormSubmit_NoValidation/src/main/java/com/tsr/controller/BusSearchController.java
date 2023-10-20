package com.tsr.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tsr.form.BusDTO;
import com.tsr.form.BusForm;

@Controller
public class BusSearchController {
	
	@PostMapping("/do-search-bus.htm")
	public String searchOrder(@ModelAttribute("busForm") BusForm busForm, BindingResult errors,
			ModelMap model) {
		List<BusDTO> busDtos = null;

		System.out.println(busForm);
		BusDTO busDTO1 = new BusDTO(1, "OGL", "563298741", "test1@gmail.com");
		BusDTO busDTO2 = new BusDTO(2, "VIZ", "563855551", "test2@gmail.com");
		BusDTO busDTO3 = new BusDTO(3, "Vig", "522222222", "test3@gmail.com");
		busDtos = Arrays.asList(new BusDTO[] {busDTO1,busDTO2,busDTO3});
		model.addAttribute("buses", busDtos);
		return "bus-details";
	}
}
