package samp02.service;
import org.springframework.stereotype.Service;
import samp02.model.Member;
@Service
public class MemberPrint {
	public void print(Member member) {
		System.out.printf(
			"아이디:%s, 이메일:%s, 암호:%s, 이름:%s, 날자:%TF\n",
			member.getId(),member.getEmail(),member.getPassword(),
			member.getName(),member.getRegdate());
	}
}