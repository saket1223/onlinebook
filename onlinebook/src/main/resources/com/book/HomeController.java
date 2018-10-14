package com.book;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String viewHome(){
		return "index";
	}
	
	@RequestMapping("/show")
	public String viewHome(){
		return "show";
	}
}
