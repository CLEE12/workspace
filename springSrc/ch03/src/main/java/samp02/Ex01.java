package samp02;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import samp02.dao.MemberDao;
import samp02.model.Member;
import samp02.service.ChangePassWord;
import samp02.service.DeleteMember;
import samp02.service.ListPrint;
import samp02.service.MemberInsert;
import samp02.service.MemberPrint;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext(
			"classpath:beans02.xml");
		MemberInsert mi = ac.getBean(MemberInsert.class);
		MemberPrint  mp = ac.getBean(MemberPrint.class);
		MemberDao    md = ac.getBean(MemberDao.class);
		ChangePassWord cp = ac.getBean(ChangePassWord.class);
		ListPrint    lp = ac.getBean(ListPrint.class);
		DeleteMember dm = ac.getBean(DeleteMember.class);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("명령어를 입력하세요");
			String command = sc.nextLine();
			if (command.equalsIgnoreCase("exit")) {
				System.out.println("작업 종료");
				break;
			} else if (command.startsWith("new")) {
				insert(command.split(" "),mi);
			} else if (command.startsWith("info")) {
				info(command.split(" "),md,mp);
			} else if (command.startsWith("change")) {
				change(command.split(" "),cp); 
			} else	if (command.equalsIgnoreCase("list")) {
				list(lp);
			} else if (command.startsWith("delete")) {
				delete(command.split(" "),dm);
			} else help();
		}
		sc.close();
	}
	private static void delete(String[] str, DeleteMember dm) {
		if (str.length !=2) {
			System.out.println("명령가 잘못됐네 꺼져 !");
			help();
			return;
		}
		int result = dm.delete(str[1]);
		if (result > 0 ) System.out.println("삭제 성공");
	}
	private static void list(ListPrint lp) {
		lp.printAll();		
	}
	private static void change(String[] str, ChangePassWord cp) {
		if (str.length !=4) {
			System.out.println("명령가 잘못됐네 꺼져 !");
			help();
			return;
		}
		int result = cp.changePass(str[1],str[2],str[3]);
		if (result > 0) System.out.println("암호 수정 성공");
	}
	private static void info(String[] str,MemberDao md,MemberPrint mp) {
		if (str.length !=2) {
			System.out.println("명령가 잘못됐네 꺼져 !");
			help();
			return;
		}
		Member member = md.getMember(str[1]);
		if (member == null) {
			System.out.println("없는 멤버입니다");
			return;
		}
		mp.print(member);
		System.out.println("출력 완료");
	}
	public static void insert(String[] str, MemberInsert mi) {
		if (str.length != 5) {
			System.out.println("명령가 잘못됐습니다");
			help();
			return;
		}
		Member member = new Member(str[1],str[2],str[3],str[4]);
		int result = mi.insert(member);
		if (result > 0) System.out.println("입력성공"); 
	}
	public static void help() {
		System.out.println();
		System.out.println("잘못된 명령입니다. 명령어 사용법을 확인하세요.");
		System.out.println("명령어 사용법:");
		System.out.println("new id 이메일 암호 이름");
		System.out.println("info id");
		System.out.println("change id 구암호 신암호");
		System.out.println("list");
		System.out.println("delete id");
		System.out.println();
	}
}