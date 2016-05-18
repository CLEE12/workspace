package sample17;
public class MemberPrinter {
	public void print(Member member) {
	  System.out.printf(
		"회원정보 : ID=%d, 이메일=%s, 이름=%s, 암호=%s, 등록일=%TF\n",
		member.getId(),member.getEmail(),member.getName(),
		member.getPassword(),member.getRegisterDate());
	}
}