package lush.xyz.web;

import java.util.Map;

import javax.annotation.Resource;

import lush.xyz.service.LushCityManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Handles requests for the application home page.
 */
@Controller
public class LushDBConController {
   
   @Resource
   private LushCityManager manger;
	/**
	 * @throws Exception 
	 */
	@RequestMapping(value = "/xyz/dbcontest.lush")
	public String selectCityCodeList(ModelMap model) throws Exception {
		Map<String, Object> map = manger.selectCityCodeList();
		model.addAttribute("cityList", map.get("cityList"));
		return "/xyz/dbcontest";
	}
	
}
