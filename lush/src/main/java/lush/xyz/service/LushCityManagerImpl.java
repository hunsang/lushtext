package lush.xyz.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("LushCityManger")
public class LushCityManagerImpl implements LushCityManager {
	
	@Resource(name="CityDAO")
	private CityDAO cityDAO;

	public  Map<String, Object> selectCityCodeList() throws Exception {
		List<CityVO> list = cityDAO.selectCityCodeList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cityList", list);
		return map;

	}
}
