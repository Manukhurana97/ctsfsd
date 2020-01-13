package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserMainCode {
	String password;
	static Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
    static Pattern lowerCasePatten = Pattern.compile("[a-z ]");
    static Pattern digitCasePatten = Pattern.compile("[0-9 ]");
    static Pattern specailCharPatten = Pattern.compile("[^a-zA-Z0-9 ]", Pattern.CASE_INSENSITIVE);
    static Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
    
	
	
	static boolean valid=true;
	public static boolean checkPassword(String password) throws passwordexception
	{
		if(password.length()<8) 
		{
			valid = false ;
			throw new passwordexception("length of password is less then 8");
			
		}
		if(!specailCharPatten.matcher(password).find()) 
		{
			valid = false ;
			throw new passwordexception("password do not contain combination character");
			
		}
		if(!lowerCasePatten.matcher(password).find()) 
		{
			valid = false ;
			throw new passwordexception("password do not contain lower character");
			
		}
		if(!UpperCasePatten.matcher(password).find()) 
		{
			valid = false ;
			throw new passwordexception("password do not contain upper character");
			
		}
		if(!digitCasePatten.matcher(password).find()) 
		{
			valid = false ;
			throw new passwordexception("password do not contain upper character");
			
		}
		if(!special.matcher(password).find()) 
		{
			valid = false ;
			throw new passwordexception("password do not contain Special character");
			
		}
		
		return valid;
	}

}