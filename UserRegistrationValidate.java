package com.bridgelab.practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistrationValidate {
	
	public boolean validateFirstName(String firstname) {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(firstname);
		return matcher.matches();
	}
        public boolean validateLastName(String lastname) {
		Pattern pattern= Pattern.compile("[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(lastname);
		return matcher.matches();
	}
	public boolean validateEmail(String email) {
		Pattern pattern= Pattern.compile("(abc)[.]?[a-z]*@(bl.co)[.]?[a-z]{0,2}$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	public boolean validatePhoneNumber(String phonenumber) {
		Pattern pattern = Pattern.compile("[0-9]{2} [0-9]{10}");
		Matcher matcher = pattern.matcher(phonenumber);
		return matcher.matches();
	}

}
