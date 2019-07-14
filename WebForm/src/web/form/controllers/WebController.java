package web.form.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("/getWebForm")
	public String getWebForm() {
		return "Form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "FormProcessed";
	}
	
	
}
