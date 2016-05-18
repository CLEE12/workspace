package shopping4.service;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import shopping4.model.Member;
@Service("memberValidator")
public class MemberValidator implements Validator {
	public boolean supports(Class<?> arg0) {
		return false;
	}
	public void validate(Object obj, Errors errors) {
		Member member = (Member)obj;
		if (!StringUtils.hasLength(member.getId())) {
			errors.rejectValue("id", "error.required");
		}
		if (!StringUtils.hasLength(member.getPasswd())) {
			errors.rejectValue("passwd", "error.required");
		}
		if (!StringUtils.hasLength(member.getAddress())) {
			errors.rejectValue("address", "error.required");
		}
		if (!StringUtils.hasLength(member.getName())) {
			errors.rejectValue("name", "error.required");
		}
		if (!StringUtils.hasLength(member.getTel())) {
			errors.rejectValue("tel", "error.required");
		}
		if (errors.hasErrors()) {
			errors.reject("error.input.member");
		}	
	}
}