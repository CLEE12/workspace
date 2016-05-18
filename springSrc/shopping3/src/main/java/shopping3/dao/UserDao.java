package shopping3.dao;
import shopping3.model.User;
public interface UserDao {
	User chk(String userId,String password);
}