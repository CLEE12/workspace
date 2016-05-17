import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/*")
public class LogFil implements Filter {
	PrintWriter pw;
	public void destroy() {	if (pw != null) pw.close();	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		GregorianCalendar gc = new GregorianCalendar();
		String date = String.format("%TF %TT",gc,gc);
		pw.println(date + " : 컴포넌트 시작 ");
		pw.flush();
		chain.doFilter(request, response);
		pw.println(date + " : 컴포넌트 종료 ");
		pw.flush();
	}
	public void init(FilterConfig fConfig) throws ServletException {
		try {pw=new PrintWriter(new FileWriter("c:/gov/filLog.txt"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}