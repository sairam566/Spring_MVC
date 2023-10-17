package com.tsr.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tsr.dto.BusDTO;

@Controller
public class BusController {
	
	private Map<Integer, BusDTO> busDeatils = null;
	
	@PostConstruct
	public void init() {
		busDeatils = new HashMap<>();
		BusDTO bus1 = new BusDTO(1, "MX1", "OGL", "MKR", LocalDate.of(2023, 9, 17));
		BusDTO bus2 = new BusDTO(2, "MSS", "HYD", "OGL", LocalDate.of(2023, 9, 17));
		BusDTO bus3 = new BusDTO(3, "RDW", "VIZ", "VIJ", LocalDate.of(2023, 9, 17));
		BusDTO bus4 = new BusDTO(4, "SSS", "GUN", "MKR", LocalDate.of(2023, 9, 17));
		
		busDeatils.put(1, bus1);
		busDeatils.put(2, bus2);
		busDeatils.put(3, bus3);
		busDeatils.put(4, bus4);
	}
	
	@RequestMapping(value = "/availablebuses.htm",method = RequestMethod.GET)
	public ModelAndView getAvailableBuses(ModelAndView view) {
		List<BusDTO> list = busDeatils.values().stream().collect(Collectors.toList());
		view.addObject("buslist", list);
		view.setViewName("available-bus");
		return view;
	}
	
	@RequestMapping(value = "/{busNo}/busdetails.htm",method = RequestMethod.GET)
	public ModelAndView getBusDetails(@PathVariable("busNo") Integer busNo, ModelAndView view) {
		BusDTO bus = busDeatils.get(busNo);
		view.addObject("busInfo", bus);
		view.setViewName("bus-details");
		return view;
	}
}
