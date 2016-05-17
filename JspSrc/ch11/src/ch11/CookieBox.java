package ch11;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;
import javax.servlet.http.*;

public class CookieBox {
	private Map<String,Cookie> cm = new HashMap<>();
	public CookieBox(HttpServletRequest request) {
		Cookie[] cooks = request.getCookies();
		if(cooks != null) {
			for (int i=0; i<cooks.length; i++) {
				cm.put(cooks[i].getName(), cooks[i]);
			}
		}
	}
	public static Cookie createCookie(String name, String value) throws UnsupportedEncodingException {
		return new Cookie(name, URLEncoder.encode(value, "utf-8"));
	}
	public Cookie getCookie(String name) {
		return cm.get(name);
	}
	public String getValue(String name) throws UnsupportedEncodingException {
		Cookie cook = cm.get(name);
		if (cook == null) return null;
		return URLDecoder.decode(cook.getValue(), "utf-8");
	}
}
