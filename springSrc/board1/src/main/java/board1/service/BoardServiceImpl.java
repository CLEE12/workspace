package board1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import board1.dao.BoardDao;
import board1.model.Board;
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDao bd;
	public List<Board> list() {
		return bd.list();
	}
	public int insert(Board board) {
		return bd.insert(board);
	}
	public void updateHit(int id) {
		bd.updateHit(id);
		
	}
	public Board select(int id) {
		return bd.select(id);
	}
	public int update(Board board) {
		return bd.update(board);
	}
	public int delete(int id) {
		return bd.delete(id);
	}
}