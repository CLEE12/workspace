import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("*") //전체 폴더가 적용받을 수 있게 적용
public class Filter1 implements Filter {
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("시작");
		chain.doFilter(request, response);
		System.out.println("끝");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
