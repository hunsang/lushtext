package lush.xyz.service;
import java.io.Serializable;

@SuppressWarnings("serial")
public class CityVO implements Serializable  {
	private String Name;
	private String CountryCode;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	
}
