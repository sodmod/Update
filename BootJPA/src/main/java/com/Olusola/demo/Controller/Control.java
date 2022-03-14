package com.Olusola.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Olusola.demo.Repo.Repos;
import com.Olusola.demo.model.Alien;

@Controller
public class Control
{
	
	@Autowired
	Repos repo;
	
	@RequestMapping("/home")
	public String home()
	{
		return "home.jsp" ;
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien bj)
	{
		repo.save(bj) ;
		return "home.jsp";
	}
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam String phoneNumber)
	{
		ModelAndView mv = new ModelAndView("GetAlien.jsp");
		Alien bj = repo.findById(phoneNumber).orElse(new Alien()) ;
		
		System.out.println(repo.findByUserName("")) ;
		System.out.println(repo.findBylname(""));
		
		
		mv.addObject(bj);
		return mv;
	}
}
