package assignemnt_three_softwareEng.email_validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * method for checking invalid email inputs
 *
 */
public class emailValidator {
	
		public emailValidator(){
			
		}
		int count = 0, count2=0;
		
		public  int validateThEmail(String email){
			
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
			
			//String must contain only.com
			if (email.contains(".com")){
				 count++;
			}
			
			//String must not be empty
			if (!(email.length()==0)){
				count++;
			}
			
			
			return count;
			
			
		}
	}




