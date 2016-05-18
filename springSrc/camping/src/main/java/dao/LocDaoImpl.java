package dao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class LocDaoImpl implements LocDao{
	@Autowired
	private SqlSession session;	
	public String getLocName(Integer locCode) {
		return session.selectOne("selectLocName", locCode);
	}
	public String getPicUrl(Integer locCode) {
		return session.selectOne("selectLocPicUrl", locCode);
	}
}