package board1.dao;
import java.util.List;
import board1.model.Board;
public interface BoardDao {
	List<Board> list();
	int insert(Board board);
	void updateHit(int id);
	Board select(int id);
	int update(Board board);
	int delete(int id);
}