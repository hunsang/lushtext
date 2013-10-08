package lush.login.service;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl  implements LoginService {

    @Resource(name="loginDAO")
    private LoginDAO loginDAO;
    
    public LoginVO actionLogin(LoginVO vo) throws Exception {
    	
    	// 1. 입력한 비밀번호를 암호화한다.
    	//String enpassword = EgovFileScrty.encryptPassword(vo.getPassword());
    	String enpassword = vo.getPassword();
    	vo.setPassword(enpassword);
    	
    	// 2. 아이디와 암호화된 비밀번호가 DB와 일치하는지 확인한다.
    	LoginVO loginVO = loginDAO.actionLogin(vo);
    	
    	// 3. 결과를 리턴한다.
    	if (loginVO != null && !loginVO.getEmail().equals("") && !loginVO.getPassword().equals("")) {
    		return loginVO;
    	} else {
    		loginVO = new LoginVO();
    	}
    	
    	return loginVO;
    }
    
    
}