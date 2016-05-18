package board2.service;
public class PagingBean {
	private final int rowPerPage 	= 10, pagePerBlock  = 10;
	private int currentPage, total, totPage,startPage,endPage,no;
	public PagingBean(int currentPage, int total) {
		this.currentPage = currentPage;	this.total = total;
		totPage = (int)Math.ceil((double)total/rowPerPage);
		startPage = currentPage - (currentPage-1) % pagePerBlock;
		endPage   = startPage + pagePerBlock - 1;
		if (endPage > totPage) endPage = totPage;
		no = total - ((currentPage - 1) * rowPerPage);
	}
	public int getCurrentPage() {	return currentPage;	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotal() {	return total;	}
	public void setTotal(int total) {	this.total = total;	}
	public int getTotPage() {	return totPage;	}
	public void setTotPage(int totPage) {
		this.totPage = totPage;
	}
	public int getStartPage() {	return startPage;	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {	return endPage;	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getNo() {	return no;	}
	public void setNo(int no) {	this.no = no;	}
	public int getRowPerPage() {	return rowPerPage;		}
	public int getPagePerBlock() {	return pagePerBlock;	}	
}