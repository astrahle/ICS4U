package com.bayviewglen.TestPackage;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
	
		int randomNumber = (int) (Math.random() * 10);
		int inputNumber;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your guess (0-10):");
		inputNumber = scanner.nextInt();
		
		if (randomNumber == inputNumber){
			System.out.println("You were right!!!");
		}
		else
			System.out.println("You were wrong.");

	}

}
