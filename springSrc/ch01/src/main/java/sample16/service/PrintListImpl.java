package sample16.service;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sample16.dao.MemberDao;
import sample16.model.Member;
@Service
public class PrintListImpl implements PrintList {
	@Autowired
	private MemberDao md;
	@Autowired
	private MemberPrinter mp;
	public void printAll() {
		Collection<Member> list = md.selectAll();
		for(Member member : list) {
			mp.print(member);
		}
	}
}