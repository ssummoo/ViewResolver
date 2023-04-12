package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	//#1 data1, data2을 가져옴
	@GetMapping("/test1")
	public String test1() {
		
		return "test1";
	}
	
	//#2 
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		//data담기 또는 오라클에서 데이터 가져와서 담기
		
		request.setAttribute("data1", 100);
		request.setAttribute("data2", 200);
		
		return "test2";
	}
	
	//#3 
	@GetMapping("/test3")
	public String test3(Model model) {
		//Model객체로 셋팅시 HttpServletRequest객체에 담겨서 jsp로 전달
		
		model.addAttribute("data1", 300);
		model.addAttribute("data2", 400);
		
		return "test3";
	}
	
	//#4 
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		//ModelAndView객체로 셋팅시 HttpServletRequest객체에 담겨서 jsp로 전달
		//ModelAndView : Model과 View이름을 지정하는 기능
		mv.addObject("data1", 500);
		mv.addObject("data2", 600);
	    //View의 이름
		mv.setViewName("test4");
		
		return mv;
	}
	
	
}