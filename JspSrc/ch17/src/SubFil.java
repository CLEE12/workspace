import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/*@WebFilter("/sub1/*") //sub1 폴더만 적용받게 설정*/
@WebFilter(urlPatterns={"/sub1/*","/sub2/*"})
public class SubFil implements Filter {
    public SubFil() {
    }
    public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("sub1의 필터 시작");
		chain.doFilter(request, response);
		System.out.println("sub1의 필터 끝");
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
