package lush.xyz.service;
import java.util.List;

import lush.com.AbstractDAO;
import lush.xyz.service.CityVO;

import org.springframework.stereotype.Repository;

@Repository("CityDAO")
public class CityDAO extends AbstractDAO {
	
	@SuppressWarnings("unchecked")
	public List<CityVO> selectCityCodeList() throws Exception {
		return list("CityDAO.selectCityCodeList",null);
	    }

}
