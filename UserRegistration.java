package com.bridgelab.practice;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	//method to validate first name
		public boolean validateFirstName(String firstname) {
			Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
			Matcher matcher = pattern.matcher(firstname);
			return matcher.matches();
		}
	        //method to validate last name
	        public boolean validateLastName(String lastname) {
			Pattern pattern= Pattern.compile("[A-Z][a-z]{2,}");
			Matcher matcher = pattern.matcher(lastname);
			return matcher.matches();
		}
	        //method to validate email
		public boolean validateEmail(String email) {
			Pattern pattern= Pattern.compile("^(abc)[-.+0-9a-z]*@[a-z0-9]+[.][a-z]{0,3}[.]?[a-z]{0,2}$");
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		}
	        //method to validate phone number
		public boolean validatePhoneNumber(String phonenumber) {
			Pattern pattern = Pattern.compile("[0-9]{2} [0-9]{10}");
			Matcher matcher = pattern.matcher(phonenumber);
			return matcher.matches();
		}
	        //method to validate password
	        public boolean validatePassWord(String password) {
	                Pattern pattern = Pattern.compile("[A-Z]+[0-9]+[@$&#]{1}\\w{5,}");
	                Matcher matcher = pattern.matcher(password);
	                return matcher.matches();
	        }
		public static void main(String[] args) {
	        	UserRegistration user = new UserRegistration();
					
			System.out.println(user.validateFirstName("Himanshu"));;
			System.out.println(user.validateLastName("Rai"));
			System.out.println(user.validateEmail("abc.xyz@bl.co.in"));
			System.out.println(user.validatePhoneNumber("91 9532757773"));
			System.out.println(user.validatePassWord("H7@aS7ft"));
			//validate multiple email entries
			ArrayList<String> emails = new ArrayList<>();
			emails.add("abc.xyz@bl.co.in");
			emails.add("abc.100@yahoo.com");
			emails.add("abc111@abc.com");
			emails.add("abc@abc.net.au");
			for(String str: emails) {
				System.out.println(user.validateEmail(str));
				}
			}

}
