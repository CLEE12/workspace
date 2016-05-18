package samp02.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samp02.dao.MemberDao;
import samp02.model.Member;
@Service
public class ListPrintImpl implements ListPrint {
	@Autowired
	private MemberDao md;
	@Autowired
	private MemberPrint mp;
	public void printAll() {
		List<Member> list = md.getList();
		for (Member member : list) {
			mp.print(member);
		}
	}
}