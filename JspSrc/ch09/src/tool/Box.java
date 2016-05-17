package tool;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Box extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		JspFragment body = getJspBody();
		out.println("<table border='1' cellpadding='20'><tr><td>");
		body.invoke(out);
		out.println("</td></tr><table>");
	}
}