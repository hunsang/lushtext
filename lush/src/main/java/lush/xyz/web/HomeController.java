package lush.xyz.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/xyz/xyz.lush", method = RequestMethod.GET)
	public String webXyz(Model model) {
		System.out.println("xyz");
		return "/xyz/xyz";
	}
	
	
}
