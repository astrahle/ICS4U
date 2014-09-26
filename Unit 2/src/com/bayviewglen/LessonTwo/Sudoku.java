package com.bayviewglen.LessonTwo;

import java.util.Scanner;

public class Sudoku {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);



		String lineOne;
		String lineTwo;
		String lineThree;
		String lineFour;
		String lineFive;
		String lineSix;
		String lineSeven;
		String lineEight;
		String lineNine;

		System.out.println("Welcome to the sudoku solution validator");

		System.out.println("Please enter first line: ");
		lineOne = scanner.nextLine();
		System.out.println("Please enter second line: ");
		lineTwo = scanner.nextLine();
		System.out.println("Please enter third line: ");
		lineThree = scanner.nextLine();
		System.out.println("Please enter fourth line: ");
		lineFour = scanner.nextLine();
		System.out.println("Please enter fifth line: ");
		lineFive = scanner.nextLine();
		System.out.println("Please enter sixth line: ");
		lineSix = scanner.nextLine();
		System.out.println("Please enter seventh line: ");
		lineSeven = scanner.nextLine();
		System.out.println("Please enter eighth line: ");
		lineEight = scanner.nextLine();
		System.out.println("Please enter nineth line: ");
		lineNine = scanner.nextLine();

		String[][] solution = {
				{lineOne},
				{lineTwo},
				{lineThree},
				{lineFour},
				{lineFive},
				{lineSix},
				{lineSeven},
				{lineEight},
				{lineNine}
		};

		String[] line1Split = new String[9];
		String[] line2Split = new String[9];
		String[] line3Split = new String[9];
		String[] line4Split = new String[9];
		String[] line5Split = new String[9];
		String[] line6Split = new String[9];
		String[] line7Split = new String[9];
		String[] line8Split = new String[9];
		String[] line9Split = new String[9];

		line1Split = solution[0][0].split(" ", 9);
		line2Split = solution[1][0].split(" ", 9);
		line3Split = solution[2][0].split(" ", 9);
		line4Split = solution[3][0].split(" ", 9);
		line5Split = solution[4][0].split(" ", 9);
		line6Split = solution[5][0].split(" ", 9);
		line7Split = solution[6][0].split(" ", 9);
		line8Split = solution[7][0].split(" ", 9);
		line9Split = solution[8][0].split(" ", 9);

		int[][] numSolution = new int[9][9];

		for (int x = 0; x < 9; x++){
			numSolution[0][x] = Integer.parseInt(line1Split[x]);
		}

		for (int x = 0; x < 9; x++){
			numSolution[1][x] = Integer.parseInt(line2Split[x]);
		}

		for (int x = 0; x < 9; x++){
			numSolution[2][x] = Integer.parseInt(line3Split[x]);
		}

		for (int x = 0; x < 9; x++){
			numSolution[3][x] = Integer.parseInt(line4Split[x]);
		}

		for (int x = 0; x < 9; x++){
			numSolution[4][x] = Integer.parseInt(line5Split[x]);
		}

		for (int x = 0; x < 9; x++){
			numSolution[5][x] = Integer.parseInt(line6Split[x]);
		}

		for (int x = 0; x < 9; x++){
			numSolution[6][x] = Integer.parseInt(line7Split[x]);
		}

		for (int x = 0; x < 9; x++){
			numSolution[7][x] = Integer.parseInt(line8Split[x]);
		}

		for (int x = 0; x < 9; x++){
			numSolution[8][x] = Integer.parseInt(line9Split[x]);
		}

		//IT WORKS HAHAHAHAH IM A GENIUS!!
		//System.out.println(line1Split[0]);
		//System.out.println(line1Split[1]);

		// now to check if this is a proper soduku solution

		for (int col = 0; col < 9; col++){
			for (int row = 0; row < 9; row++){
				if (numSolution[col][row] == numSolution[col][row+1] && row != 8){
					System.out.println("Invalid Solution!!");
					System.out.println("Error: Duplicate number in line " + row);
				}
			}
		}
		
		for (int row = 0; row < 9; row++){
			for (int col = 0; col < 9; col++){
				if (numSolution[row][col] == numSolution[row][col+1] && col != 8){
					System.out.println("Invalid Solution!!");
					System.out.println("Error: Duplicate number in column " + col);
				}
			}
		}
		
		for (int col = 0; col < 3; col++){
			for (int row = 0; row < 3; row++){
				if (numSolution[col][row] == numSolution[col][row+1] && row !=2){
					System.out.println("Invalid");
				}
			}
		}
		
		for (int col = 3; col < 6; col++){
			for (int row = 0; row < 3; row++){
				if (numSolution[col][row] == numSolution[col][row+1] && row !=2){
					System.out.println("Invalid");
				}
			}
		}


	}
}
