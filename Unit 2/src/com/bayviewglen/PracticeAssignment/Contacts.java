package com.bayviewglen.PracticeAssignment;

public class Contacts {
	private String lname;
	private String fname;
	private String phone;

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

	public String getLastName(){
		return lname;
	}

	public String getFirstName(){
		return fname;
	}

	public String getPhoneNumber(){
		return phone;
	}

	public void setLastName(String tempLast){
		lname = tempLast;
	}

	public void setFirstName(String tempFirst){
		fname = tempFirst;
	}

	public void setPhoneNumber(String tempPhone){
		phone = tempPhone;
	}

	public void showContact(){
		System.out.println(fname + ", " + lname + "," + phone);
	}
	

}
