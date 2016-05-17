package service;
import java.io.File;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.PdsItemDao;
import model.PdsItem;
public class InsertPds {
	public int insert(HttpServletRequest request) {
		int result = 0; MultipartRequest mr = null;
		String save = "/upload";
		String real = request.getSession()
			.getServletContext().getRealPath(save);
		int maxSize = 10 * 1024 * 1024;
		try { mr = new MultipartRequest(request, real, maxSize,
				"utf-8",new DefaultFileRenamePolicy());
		} catch (IOException e) {
			System.out.println(e.getMessage()); }
		String fileName = mr.getFilesystemName("file");
		String description = mr.getParameter("description");
		File file = new File(real+"/"+fileName);
		int  size = (int)file.length();
		PdsItem pi = new PdsItem();
		pi.setFileName(fileName);
		pi.setFileSize(size);
		pi.setDescription(description);
		PdsItemDao pd = PdsItemDao.getInstance();
		result = pd.insert(pi);
		return result;
	}
}