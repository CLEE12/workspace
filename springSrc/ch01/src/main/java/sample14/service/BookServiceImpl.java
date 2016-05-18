package sample14.service;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample14.dao.BookDao;
import sample14.model.Book;
@Service
public class BookServiceImpl implements BooKService{
	// @Autowired
	@Resource
	private BookDao bd;
	public Book getBook() {
		return bd.getBook("태양의 후례자식");
	}
}