package board1.dao;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import board1.model.Board;
@Repository
public class BoardDaoImpl implements BoardDao {
	private static SqlMapClient sqlMapper;
	static {
	    try {
	      Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
	      sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
	      reader.close(); 
	    } catch (IOException e) {
	      System.out.println("리소스 못 찾았다 "+e.getMessage());
	    }
	}
	public List<Board> list() {
		List<Board> list = null;
		try {	list = sqlMapper.queryForList("list");
		} catch (SQLException e) {
				System.out.println(e.getMessage());
		}
		return list;
	}
	public int insert(Board board) {
		int result = 0;
		try { sqlMapper.insert("insert",board);
			result = 1;
		} catch (SQLException e) {
			System.out.println(e.getMessage());	}
		return result;
	}
	public void updateHit(int id) {
		try { sqlMapper.update("updateHit",id);
		} catch (SQLException e) {
			System.out.println(e.getMessage());	}		
	}
	public Board select(int id) {
		Board board = null;
		try { board=(Board)sqlMapper.queryForObject("select",id);
		} catch (SQLException e) {
			System.out.println(e.getMessage());	}
		return board;
	}
	public int update(Board board) {
		int result = 0;
		try { result = sqlMapper.update("update",board);
		} catch (SQLException e) {
			System.out.println(e.getMessage());	}
		return result;
	}
	public int delete(int id) {
		int result = 0;
		try { result = sqlMapper.delete("delete",id);
		} catch (SQLException e) {
			System.out.println(e.getMessage());	}
		return result;
	}
}