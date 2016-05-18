package samp11.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import samp11.dao.BookDao;
import samp11.model.Book;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bd;
	public Book getBook() {
		return bd.getBook("하수와 고수");
	}
}