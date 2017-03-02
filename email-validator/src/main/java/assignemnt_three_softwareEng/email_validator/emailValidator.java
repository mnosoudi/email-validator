package assignemnt_three_softwareEng.email_validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * method for checking invalid email inputs
 *
 */
/**
 * method for checking invalid email inputs
 *
 */
public class emailValidator {
	
	public  int validateThEmail(String email){
		
	
		
		int count = 0, count2=0;
		
		
			if (email.contains(".")){
				count++ ;
			}
				
				
				
			for (int i=0; i<email.length(); i++){
				
				
				if (email.charAt(i) == '@'){
				count2++; 
				
					if(count2==1){
					count++;
					 }
				
				 }
			}
			return count;	
				
	}

}