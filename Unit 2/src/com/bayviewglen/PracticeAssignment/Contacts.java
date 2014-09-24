package com.bayviewglen.PracticeAssignment;

public class Contacts {
	private static String lname;
	private static String fname;
	private static String phone;
	
		public Contacts(){
			lname = null;
			fname = null;
			phone = null;
		}
		
		public Contacts(String last, String first, String phoneNum){
			lname = last;
			fname = first;
			phone = phoneNum;
		}
	
		public static String getLastName(){
			return lname;
		}
		
		public static String getFirstName(){
			return fname;
		}
		
		public static String getPhoneNumber(){
			return phone;
		}
		
		public static void setLastName(String tempLast){
			lname = tempLast;
		}
		
		public static void setFirstName(String tempFirst){
			fname = tempFirst;
		}
		
		public static void setPhoneNumber(String tempPhone){
			phone = tempPhone;
		}
		
		public String toString(){
			return fname + " " + lname + " " + phone;
		}
		

}
