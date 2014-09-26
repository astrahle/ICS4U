package com.bayviewglen.LessonTwo;

import java.util.Scanner;

public class GPS {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);

		int numCoordinates;
		int choice = 0;
		int counter = 0;
		String entCor;

		boolean realAnswer = false;
		boolean realAnswer2 = false;


		System.out.println("Number of coordinates: ");

		while(!realAnswer){
			try{
				choice = scanner.nextInt();
				if (choice > 0){
					realAnswer = true;
				}else{
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("... thats not a valid answer. Try again: ");
				choice = scanner.nextInt();
			}
		}

		numCoordinates = choice;

		// we need to accept decimals so we have to use double
		double [][] coordinates = new double[choice][2]; //second value is 2 because (x, y)

		System.out.println("Please enter your coordinates. (1,2) (1,3)");
		entCor = scanner.nextLine();

		while(!realAnswer2){
			try{
				for(int x = 0; x < coordinates.length; x++){
					for (int i = 0; i < coordinates[0].length; i++){
						coordinates[x][i] = Double.parseDouble(entCor.split(" ")[counter]);
						counter++;
					}
				}

				realAnswer2 = true;
			}catch(Exception e){
				System.out.println("Invalid input. Enter a valid one.");
				realAnswer2 = false;
				entCor = scanner.nextLine();
			}
		}
		System.out.println("Entered Coordinates:");

		for (int x = 0; x < coordinates.length; x++){
			for (int y = 0; y < coordinates[0].length; y++){
				System.out.println(coordinates[x][y] + " ");
			}
		}

		double closestDistance = 999999999; //had to be really big number so that nothing can beat it at first
		double[][] winningPair= new double[2][2];
		double distanceAway;

		for (int x = 0; x < coordinates.length; x++){
			for (int y = 0; y < coordinates.length; y++){
				distanceAway = Math.sqrt((Math.pow(coordinates[y][0]-coordinates[x][0], 2)) + (Math.pow(coordinates[y][1]-coordinates[x][1], 2)));
				if (distanceAway < closestDistance && x != y){
					closestDistance = distanceAway;
					winningPair[0][0] = coordinates[x][0];
					winningPair[0][1] = coordinates[x][1];
					winningPair[1][0] = coordinates[y][0];
					winningPair[1][0] = coordinates[y][1];
				}
			}
		}

		System.out.println("The closest pair is: " + winningPair[0][0] + "," + winningPair[0][1] + " and " + winningPair[1][0] + "," + winningPair[1][1]);

	}

}
