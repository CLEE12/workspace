package board1.service;
import java.util.List;
import board1.model.Board;
public interface BoardService {
	List<Board> list();

	int insert(Board board);

	void updateHit(int id);

	Board select(int id);

	int update(Board board);

	int delete(int id);

}