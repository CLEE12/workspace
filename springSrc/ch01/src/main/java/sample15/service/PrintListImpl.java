package sample15.service;
import java.util.Collection;
import sample15.dao.MemberDao;
import sample15.model.Member;
public class PrintListImpl implements PrintList {
	private MemberDao md;
	private MemberPrinter mp;
	public void setMd(MemberDao md) {		this.md = md;	}	
	public void setMp(MemberPrinter mp) {	this.mp = mp;	}
	public void printAll() {
		Collection<Member> list = md.selectAll();
		for(Member member : list) {
			mp.print(member);
		}
	}
}