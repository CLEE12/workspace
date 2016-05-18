package sample12;
public class BookServiceImpl implements BookService {
	private BookDao bd;	
	public void setBd(BookDao bd) {
		this.bd = bd;
	}
	public Book getBook() {
		return bd.getBook("태양의 후회");
	}
}