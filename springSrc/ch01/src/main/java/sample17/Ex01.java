package sample17;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		MemberInsert mi = ac.getBean(MemberInsert.class);
		MemberPrinter mp = ac.getBean(MemberPrinter.class);
		MemberDao md = ac.getBean(MemberDao.class);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("명령어를 입력하세요");
			String cmd = sc.nextLine();
			if (cmd.equalsIgnoreCase("exit")) {
				System.out.println("종료합니다");
				break;
			} else if (cmd.startsWith("new")) {
				insert(cmd.split(" "), mi);
			} else if (cmd.startsWith("info")) {
				print(cmd.split(" "), mp, md);
			} else
				help();
		}
		sc.close();
	}

	public static void insert(String[] str, MemberInsert mi) {
		if (str.length != 5) {
			System.out.println("명령어가 잘못됐습니다");
			help();
			return;
		}
		RegisterMember rm = new RegisterMember();
		rm.setEmail(str[1]);
		rm.setName(str[2]);
		rm.setPassword(str[3]);
		rm.setConfirmPassword(str[4]);
		if (!rm.isConfirm()) {
			System.out.println("암호가 대박이네 으이그");
			help();
			return;
		}
		int result = mi.insert(rm);
		if (result > 0)
			System.out.println("입력 성공");
	}

	public static void print(String[] str, MemberPrinter mp, MemberDao md) {
		if (str.length != 2) {
			System.out.println("명령어가 잘못됐습니다");
			help();
			return;
		}
		Member member = md.selectByEmail(str[1]);
		if (member != null)
			mp.print(member);
		else
			System.out.println("없는 데이터 입니다");
	}

	public static void help() {
		System.out.println();
		System.out.println("잘못된 명령입니다.");
		System.out.println("명령어 사용법:");
		System.out.println("new 이메일 이름 암호 암호확인");
		System.out.println("exit");
		System.out.println();
	}
}