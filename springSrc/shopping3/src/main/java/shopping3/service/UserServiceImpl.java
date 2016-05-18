package shopping3.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopping3.dao.UserDao;
import shopping3.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao ud;
	public User chk(String userId, String password) {
		return ud.chk(userId, password);
	}
}