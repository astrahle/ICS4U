package com.bayviewglen.TestPackage;

import java.util.Scanner;

public class KatieNeedsHelp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String[] Katie = new String[5];
		String i = "Used";
		
		Katie[0] = "k";
		Katie[1] = "a";
		Katie[2] = "t";
		Katie[3] = "i";
		Katie[4] = "e";
		
		for (int x = 0; x < Katie.length; x++){
			System.out.println(Katie[x]);
			Katie[x] = i;
			System.out.println(Katie[x]);
			
		}
		
		boolean done = false;
		String choice;
		while (!done){
			System.out.println("Katie!!!");
			System.out.println("Katie!!!");
			System.out.println("Katie!!!");
			System.out.println("Katie!!!");
			
			System.out.println("Done?");
			choice = scanner.nextLine();
			
			if (choice == "y"){
				done = true;
			}
		}

}
}

