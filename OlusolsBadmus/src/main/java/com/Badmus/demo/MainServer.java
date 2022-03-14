package com.Badmus.demo ;

import org.springframework.stereotype.Controller ;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RequestParam ;
import org.springframework.web.servlet.ModelAndView ;

@Controller
public class MainServer 
{
	@RequestMapping("home")
	public ModelAndView display(Alien alien)
	{
		ModelAndView mv = new ModelAndView() ;
		mv.addObject("mad", alien) ;
		//mv.addObject("age", myAge) ;
		mv.setViewName("home") ;
		return mv ;
	}
}
