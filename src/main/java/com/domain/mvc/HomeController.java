package com.domain.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
final class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goToHomepage(){
		return "index";
	}

}
