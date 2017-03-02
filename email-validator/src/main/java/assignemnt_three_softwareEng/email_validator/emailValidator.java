package assignemnt_three_softwareEng.email_validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * method for checking invalid email inputs
 *
 */
public class emailValidator {


	private Pattern pattern;
	private Matcher matcher;

	private static final String EMAIL_PATTERN =
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@";

	public emailValidator() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}

	/**
	 * validiate method set the hex and return the match
	 */
	public boolean validate(final String hex) {

		matcher = pattern.matcher(hex);
		return matcher.matches();

	}
}

