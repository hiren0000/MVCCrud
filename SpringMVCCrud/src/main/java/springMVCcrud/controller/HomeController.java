package springMVCcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String home() 
	{
		System.out.println("v r going to land in home page");
        return "index";		
	}

}
