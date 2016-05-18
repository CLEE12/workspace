package ch09.controller;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch09.model.SendMail;
@Controller
public class MailController {
	@Autowired
	private JavaMailSender jms;
	@RequestMapping(value="mailSend",method=RequestMethod.GET)
	public String mailForm() {
		return "sendMail";
	}
	@RequestMapping(value="mailSend",method=RequestMethod.POST)
	public String mailSend(SendMail sm, Model model) {
		MimeMessage mms = jms.createMimeMessage();
		try{
			MimeMessageHelper messageHelper = 
				new MimeMessageHelper(mms,true,"utf-8");
			messageHelper.setSubject(sm.getTitle());
			messageHelper.setText(sm.getContent(),true);
			messageHelper.setFrom("kbj010@naver.com");
			messageHelper.setTo(sm.getEmail());
			jms.send(mms);
			model.addAttribute("msg","입력하신 이메일로 발송");
		}catch(Exception e){
			System.out.println(e.getMessage());
			model.addAttribute("msg","메일 보내기 실패");
		}
		return "sendMail";
	}
}