package sample14.dao;
import org.springframework.stereotype.Repository;
import sample14.model.Book;
@Repository
public class BookDaoImpl implements BookDao {
	public Book getBook(String title) {		
		return new Book(title,20000);
	}
}