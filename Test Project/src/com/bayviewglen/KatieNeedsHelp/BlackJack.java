package com.bayviewglen.KatieNeedsHelp;

import java.util.Locale;
import java.util.Scanner;


public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userinput = new Scanner(System.in);


		boolean done = false;

		String name = getUserName(userinput);
		Locale l = getLocale();
		int wallet = 500;



		while (!done){


			int[] numbers = new int[5];
			numbers[0] = 5;
			String[] cards = new String[52];

			cards[0] = "AS";
			cards[1] = "2S";
			cards[2] = "3S";
			cards[3] = "4S";
			cards[4] = "5S";
			cards[5] = "6S";
			cards[6] = "7S";
			cards[7] = "8S";
			cards[8] = "9S";
			cards[9] = "10S";
			cards[10] = "JS";
			cards[11] = "QS";
			cards[12] = "KS";

			cards[13] = "AD";
			cards[14] = "2D";
			cards[15] = "3D";
			cards[16] = "4D";
			cards[17] = "5D";
			cards[18] = "6D";
			cards[19] = "7D";
			cards[20] = "8D";
			cards[21] = "9D";
			cards[22] = "10D";
			cards[23] = "JD";
			cards[24] = "QD";
			cards[25] = "KD";

			cards[26] = "AC";
			cards[27] = "2C";
			cards[28] = "3C";
			cards[29] = "4C";
			cards[30] = "5C";
			cards[31] = "6C";
			cards[32] = "7C";
			cards[33] = "8C";
			cards[34] = "9C";
			cards[35] = "10C";
			cards[36] = "JC";
			cards[37] = "QC";
			cards[38] = "KC";  

			cards[39] = "AH";
			cards[40] = "2H";
			cards[41] = "3H";
			cards[42] = "4H";
			cards[43] = "5H";
			cards[44] = "6H";
			cards[45] = "7H";
			cards[46] = "8H";
			cards[47] = "9H";
			cards[48] = "10H";
			cards[49] = "JH";
			cards[50] = "QH";
			cards[51] = "KH";   






		}





	}


	private static int getBet(int wallet, Scanner userinput) {
		boolean validBet = false;
		int bet = 0;

		while (!validBet){
			System.out.print("How much would you like to bet? You Have Currently: " + wallet + " in your bank.");
			bet = userinput.nextInt();

			if (bet < 0){

				System.out.println("Not a valid bet try again: ");

			}
			if (bet > wallet){
				System.out.println("You're too poor, either get more money or try again: ");
			}
			validBet = true;
		}

		return bet;
	}


	private static Locale getLocale() {
		System.out.print("Please choose a currency you would liketo play in: ");
		System.out.print("1. Canada");
		System.out.print("2. China");
		System.out.print("3. Germany");
		System.out.print("4. France");



		return null;
	}

	private static String getUserName(Scanner userinput) {
		boolean validName = false;
		String name = "";
		while (!validName){
			System.out.print("Please enter your first and last name: ");
			name = userinput.nextLine();

			if (!name.trim().equals(""))
				validName = true;
		}
		return name;    


	}


}

