package ch17;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
public class BaboRequestWrapper extends HttpServletRequestWrapper {
	HttpServletRequest request;
	public BaboRequestWrapper(HttpServletRequest request) {
		super(request);
		this.request = request;
	}
	public String getParameter(String name) {
		String babo = request.getParameter(name)+" 바보 !";
		return babo;
	}
	public String[] getParameterValues(String name) {
		String[] str  = request.getParameterValues(name);
		String[] nStr = new String[str.length];
		for (int i = 0; i < str.length;i++) {
			nStr[i] = str[i] + " 천재 !";
		}
		return nStr;
	}
}