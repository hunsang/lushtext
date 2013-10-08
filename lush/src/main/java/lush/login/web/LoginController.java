package lush.login.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lush.login.service.LoginVO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 *
 */
@Controller
public class LoginController {

	@RequestMapping(value="/login/facebooklogin.lush")
	public String loginFaceBook()  throws Exception {
		return "/login/facebookklogin";
	}

}
