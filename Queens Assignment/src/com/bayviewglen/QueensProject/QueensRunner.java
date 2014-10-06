package com.bayviewglen.QueensProject;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class QueensRunner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean validated = false;
		boolean possibleLocation = false;
		boolean validSize = false;
		
		int boardSize = 0;
		int xIndex = 0;
		int yIndex = 0;
		
		System.out.println("Welcome to the Queens solver!!");
		System.out.println("------------------------------");
		System.out.println(" ");
		System.out.print("Please the size of the board (If 8 board will be 8 X 8, etc.):");
		
		while(!validSize){
			try{
				boardSize = scanner.nextInt();
				if (boardSize > 0 && boardSize < 25){
					validSize = true;
				}
				else{
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("Please enter a valid number.");
				System.out.println("Numbers less than 1 will not work.");
				System.out.println("Numbers greater than 25 will crash the program (memory)");
				validSize = false;
				System.out.print("Please enter the size of the board (If 8 board will be 8 X 8, etc.):");
				scanner.nextLine();
			}
		}
		
		
		String board[][] = new String[boardSize][boardSize];
		
		Stack<String> Que = new Stack<String>();
		
		for (int col = 0; col < boardSize; col++){
			System.out.println();
			for (int row = 0; row < boardSize; row++){
				board[col][row] = "   |";
			}
		}
		
		Queen.AddQueen(xIndex, yIndex, board, Que);
		
		Queen.outputBoard(boardSize, board);
		
		
	}

}
