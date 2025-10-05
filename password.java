import java.util.*;
public class password
{
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		String password;
		System.out.println("create your password");
		password=console.nextLine();
		
		boolean hasUpper = false;
		boolean hasLower = false;
		
		for (int i=0; i < password.length(); i++) {
		    char ch = password.charAt(i);
		    if (Character.isUpperCase(ch)) {
		       hasUpper = true;
		    } else if (Character.isLowerCase(ch)) {
		        hasLower = true;
		    }
		    
		  
		}

		if (password.length() <6) {
			System.out.println("very weak password, a password must contain atleast 8 digits, 1 caps and 1 small letter. ");
			System.exit(0);

		} else if (password.length() <8 || !hasUpper || !hasLower) {
			System.out.println(" weak password, a password must contain atleast 8 digits, 1 caps and 1 small letter. ");
			System.exit(0);
		} else if (password.length() >=8 ) {
			System.out.println("done");

		}
		System.out.println("confirm your password");
		String newpass;
		newpass = console.nextLine();
		if (newpass.equals(password)) {
			System.out.println("password confirmed");
		}
		else {
			System.out.println("incorrect password");
		}
	}
}
