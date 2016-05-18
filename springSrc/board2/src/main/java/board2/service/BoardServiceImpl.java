package board2.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import board2.dao.BoardDao;
import board2.model.Board;
@Service 
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDao bd;
	public List<Board> list(Board board) {
		return bd.list(board);
	}
	public int getTotal(Board board) {
		return bd.getTotal(board);
	}
	public int getNumber() {
		return bd.getNumber();
	}
	public int write(Board board) {
		return bd.write(board);
	}
	public Board select(int num) {
		return bd.select(num);
	}
	public void updateReadCount(int num) {
		bd.updateReadCount(num);		
	}
	public void delete(int num) {
		bd.delete(num);
	}
	public int update(Board board) {
		return bd.update(board);
	}
	public void updateRe_step(Board board) {
		bd.updateRe_step(board);
	}
}