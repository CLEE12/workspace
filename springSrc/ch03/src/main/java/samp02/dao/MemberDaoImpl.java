package samp02.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import samp02.model.Member;
@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private JdbcTemplate jt;
	public Member getMember(String id) {
		Member mem = null;
		try { mem = jt.queryForObject(
			"select * from member3 where id=?", 
			new BeanPropertyRowMapper<Member>(Member.class)
/*			new RowMapper<Member>() {
				public Member mapRow(ResultSet rs, int rN) throws SQLException {
				  Member member = new Member(rs.getString("id"),
				   	rs.getString("email"),rs.getString("password"),
				   	rs.getString("name"));
				  member.setRegdate(rs.getDate("regdate"));
				  return member;
				}					
			}*/,id);
		}catch(Exception e) {	return null;	}
		return mem;
	}
	public List<Member> getList() {
		List<Member> list = jt.query("select * from member3",
			new BeanPropertyRowMapper<Member>(Member.class)); 
		return list;
	}
	public int insert(Member mem) {
		int result=jt.update("insert into member3 values(?,?,?,?,sysdate)", 
			mem.getId(),mem.getEmail(),mem.getPassword(),
			mem.getName());
		return result;
	}
	public int update(Member mem) {
		int result=jt.update(
			"update member3 set password=? where id=?", 
			mem.getPassword(),mem.getId());
		return result;
	}
	public int delete(String id) {
		int result=jt.update("delete from member3 where id=?",id);
		return result;
	}
}