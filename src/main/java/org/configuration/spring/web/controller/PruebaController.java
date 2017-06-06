package org.configuration.spring.web.controller;

import org.apache.log4j.Logger;
import org.configuration.spring.web.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PruebaController {
	final static Logger logger = Logger.getLogger(PruebaController.class);
	
	@Autowired
	PruebaService pruebaService;
	
	@RequestMapping("/inicio.htm")
	public void inicio() {
		logger.info("Estamos en inicio.htm");
		pruebaService.findAll();
	}
	
	@RequestMapping("/inicio2.htm")
	public ModelAndView inicio2(){
		logger.info("Estamos en inicio2.htm");
		pruebaService.findAll();
		/*ModelAndView model = new ModelAndView();
		model.setViewName("inicio");*/
		return new ModelAndView("inicio");
	}

}
