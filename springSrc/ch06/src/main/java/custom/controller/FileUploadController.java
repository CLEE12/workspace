package custom.controller;
import java.io.File;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class FileUploadController {
	@RequestMapping(value="fileupload",method=RequestMethod.GET)
	public String upload() {
		return "fileUpLoad";
	}
	@RequestMapping(value="fileupload",method=RequestMethod.POST)
	public String upload(@RequestParam("upLoadFile")
		MultipartFile mf,Model model) throws IllegalStateException, IOException {
		String fileName = mf.getOriginalFilename();
		mf.transferTo(new File("/gov/"+fileName));
		model.addAttribute("msg", "파일 로드 성공 : "+fileName);
		return "fileUpLoad";
	}
}