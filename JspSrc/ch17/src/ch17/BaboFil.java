package ch17;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
@WebFilter("/sub4/*")
public class BaboFil implements Filter {
	public void destroy() {	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		BaboRequestWrapper brw = 
			new BaboRequestWrapper((HttpServletRequest) request);
		chain.doFilter(brw, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}
}