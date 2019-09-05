package com.neo.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.neo.service.AddService;

@Controller
public class AController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("a") int i, @RequestParam("b") int j, HttpServletRequest request, HttpServletResponse response) {
//		int i = Integer.parseInt(request.getParameter("a"));
//		int j = Integer.parseInt(request.getParameter("b"));
		
		AddService as = new AddService();
		
		int k= as.add(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		
//		System.out.println("hello");
		return mv;
	}

}
