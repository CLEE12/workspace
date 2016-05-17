package tool;
import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ReplaceWrite extends SimpleTagSupport{
	private String oldWord;
	private String newWord;
	
	public void setOldWord(String oldWord) {
		this.oldWord = oldWord;
	}
	public void setNewWord(String newWord) {
		this.newWord = newWord;
	}
	public void doTag() throws JspException, IOException {
		StringWriter sw = new StringWriter();
		JspWriter out = getJspContext().getOut();
		JspFragment body = getJspBody();
		body.invoke(sw);
		String str = sw.toString();
		String nstr = str.replaceAll(oldWord, newWord);
		out.println(nstr);
	}
}
