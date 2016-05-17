package ch17;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class ResponWrap extends HttpServletResponseWrapper {
	private static StringWriter sw = new StringWriter();
	private static PrintWriter  pw = new PrintWriter(sw);
	HttpServletResponse response;
	public ResponWrap(HttpServletResponse response) {
		super(response);	this.response = response;
	}
	public void addCookie(Cookie cookie) {
		String name  = cookie.getName();
		String value = cookie.getValue();
		String nVal  = value +  " welcome hell !!";
		Cookie cook  = new Cookie(name, nVal);
		response.addCookie(cook);
	}
	public PrintWriter getWriter() throws IOException {
		return pw;
	}
	public void replace() throws IOException {
		String str  = sw.toString();
		String nStr = str.replace("비행기","드론");
		PrintWriter out = response.getWriter();
		out.println(nStr);
	}	
}