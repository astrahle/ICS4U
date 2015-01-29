package com.bayviewglen.TestPackage;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner nameScanner = new Scanner(System.in);

		// Player Data
		int numPlayers = 0;
		
		//Validations
		boolean validNumPlayers = false;

		while (!validNumPlayers){
			System.out.println("Please enter the number of players: ");
			numPlayers = scanner.nextInt();

			if (numPlayers <= 0 ){
				System.out.println("Sorry you need to have at least 1 player");
			}
			if (numPlayers > 6){
				System.out.println("Sorry you have inputed too many players. (Max of 6)");
			}

			else if (numPlayers > 0 && numPlayers < 7){
				validNumPlayers = true;
			}

		}
		
		//Player Data
		int[] PlayerBalances = new int[numPlayers];
		String[] PlayerNames = new String[numPlayers];
		
		for (int x = 0; x < numPlayers; x++){
			PlayerBalances[x] = 1000;
			int editedNumPlayers = x+1;
			System.out.println("Please enter player " + editedNumPlayers + "'s name: ");
			PlayerNames[x] = nameScanner.nextLine();
		}



	}

}
