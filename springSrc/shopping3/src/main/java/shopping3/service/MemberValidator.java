package shopping3.service;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import shopping3.model.Member;
@Component("memberValidator")
public class MemberValidator implements Validator{
	public boolean supports(Class<?> arg0) {
		return false;
	}
	public void validate(Object command, Errors errors) {
		Member member = (Member) command;
		if (!StringUtils.hasLength(member.getId())) {
			errors.rejectValue("id", "error.required");
		}
		if (!StringUtils.hasLength(member.getPasswd())) {
			errors.rejectValue("passwd", "error.required");
		}
		if (errors.hasErrors()) {
			errors.reject("error.input.member");
		}			
	}
}