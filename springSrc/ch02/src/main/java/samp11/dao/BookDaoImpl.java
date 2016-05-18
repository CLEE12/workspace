package samp11.dao;
import org.springframework.stereotype.Repository;

import samp11.model.Book;
@Repository
public class BookDaoImpl implements BookDao {
	public Book getBook(String title) {
		return new Book(title, 20000);
	}
}