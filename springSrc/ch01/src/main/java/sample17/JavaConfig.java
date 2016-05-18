package sample17;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JavaConfig {
	@Bean
	public MemberDao getMemberDao() {
		return new MemberDaoImpl();
	}
	@Bean
	public MemberPrinter getMemberPrinter() {
		return new MemberPrinter();
	}
	@Bean
	public MemberInsert getMemberInsert() {
		return new MemberInsertImpl(getMemberDao());
	}
}