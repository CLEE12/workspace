import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
@WebFilter("/sub3/*")
public class LoginCheck implements Filter {
	public void destroy() {	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hrq  = (HttpServletRequest)request;
		HttpServletResponse hrs = (HttpServletResponse)response;
		HttpSession session = hrq.getSession();
		if (session == null) hrs.sendRedirect("../loginForm.jsp");
		String id = (String)session.getAttribute("id");
		if (id==null || id.equals("") || id.equals("null")) 
			hrs.sendRedirect("../loginForm.jsp");
		chain.doFilter(request, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}
}