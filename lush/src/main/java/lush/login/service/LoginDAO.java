package lush.login.service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import lush.com.AbstractDAO;

@Repository("loginDAO")
public class LoginDAO extends AbstractDAO {
	
	/** log */
    protected static final Log LOG = LogFactory.getLog(LoginDAO.class);
    
    public LoginVO actionLogin(LoginVO vo) throws Exception {
    	return (LoginVO)selectByPk("loginDAO.actionLogin", vo);
    }
}
