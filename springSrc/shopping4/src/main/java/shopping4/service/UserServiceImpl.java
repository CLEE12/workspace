package shopping4.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopping4.dao.UserDao;
import shopping4.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao ud;
	public void insert(User user) {
		ud.insert(user);
	}
}