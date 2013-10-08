package lush.login.service;

import java.io.Serializable;

public class LoginVO implements Serializable{
	
	private static final long serialVersionUID = -8274004534207618049L;
	
	private String email;
	private String password;
	private String url;
	private String ip;
	private String locale;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	
	
	
}
