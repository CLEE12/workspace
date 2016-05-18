package board2.service;
import java.util.List;
import board2.model.Board;
public interface BoardService {
	List<Board> list(Board board);
	int getTotal(Board board);
	int getNumber();
	int write(Board board);
	Board select(int num);
	void updateReadCount(int num);
	void delete(int num);
	int update(Board board);
	void updateRe_step(Board board);

}