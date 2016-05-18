package board2.dao;
import java.io.Reader;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import com.ibatis.common.resources.Resources;
import board2.model.Board;
@Repository
public class BoardDaoImpl implements BoardDao {
	private static SqlSession session;
	static {
		try { Reader reader = Resources.getResourceAsReader(
				"mybatis/configuration.xml");
			SqlSessionFactory ssf = 
				new SqlSessionFactoryBuilder().build(reader);
			session = ssf.openSession(true);
		} catch (Exception e) {
			System.out.println("대박에러 : "+e.getMessage());
		}
	}
	public List<Board> list(Board board) {
		return session.selectList("list", board);
	}
	public int getTotal(Board board) {
		return session.selectOne("getTotal",board);
	}
	public int getNumber() {
		return session.selectOne("getNumber");
	}
	public int write(Board board) {
		int result = 0;
		try {	result = session.insert("insert",board);
		}catch(Exception e) {System.out.println(e.getMessage()); }
		return result;
	}
	public Board select(int num) {
		return session.selectOne("select",num);
	}
	public void updateReadCount(int num) {
		session.update("updateReadCount",num);
	}
	public void delete(int num) {
		session.update("delete",num);
	}
	public int update(Board board) {
		int result = 0;
		try {	result = session.update("update",board);
		}catch(Exception e) {System.out.println(e.getMessage()); }
		return result;
	}
	public void updateRe_step(Board board) {
		session.update("updateRe_step",board);
	}
}