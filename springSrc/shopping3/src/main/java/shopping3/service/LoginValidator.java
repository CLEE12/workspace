package shopping3.service;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import shopping3.model.User;
@Component
public class LoginValidator implements Validator{
	public boolean supports(Class<?> arg0) {
		return false;
	}
	public void validate(Object command, Errors errors) {
		User user = (User) command;
		if (!StringUtils.hasLength(user.getUserId())) {
			errors.rejectValue("userId", "error.required");
		}
		if (!StringUtils.hasLength(user.getPassword())) {
			errors.rejectValue("password", "error.required");
		}
		if (errors.hasErrors()) {
			errors.reject("error.input.user");
		}		
	}
}