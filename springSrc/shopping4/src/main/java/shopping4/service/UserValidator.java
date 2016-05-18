package shopping4.service;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import shopping4.model.User;
@Service("userValidator")
public class UserValidator implements Validator {
	public boolean supports(Class<?> arg0) {
		return false;
	}
	public void validate(Object obj, Errors errors) {
		User user = (User)obj;
		if (!StringUtils.hasLength(user.getUserId())) {
			errors.rejectValue("userId", "error.required");
		}
		if (!StringUtils.hasLength(user.getPassword())) {
			errors.rejectValue("password", "error.required");
		}
		if (!StringUtils.hasLength(user.getAddress())) {
			errors.rejectValue("address", "error.required");
		}
		if (!StringUtils.hasLength(user.getEmail())) {
			errors.rejectValue("email", "error.required");
		}
		if (!StringUtils.hasLength(user.getPostCode())) {
			errors.rejectValue("postCode", "error.required");
		}
		if (!StringUtils.hasLength(user.getUserName())) {
			errors.rejectValue("userName", "error.required");
		}
		if (errors.hasErrors()) {
			errors.reject("error.input.user");
		}	
	}
}