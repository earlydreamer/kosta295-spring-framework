package web.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	@GetMapping("test.admin")
	public String test() {
		System.out.println("test.admin call");
		return "result";
		
	}
}
