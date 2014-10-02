package com.bayviewglen.LessonThree;

import java.util.Scanner;

public class QueenDriver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sizeOfBoard = 0;
	
		
		System.out.println("What is the size of the board?");
		sizeOfBoard = scanner.nextInt();
		
		String[][] board = new String[sizeOfBoard][sizeOfBoard];
		String[] queenPositions = new String[sizeOfBoard];
		
		boolean done = false;
		
		while (!done){
			new Queens(0, 0);
			board[0][0] = "Q";
			queenPositions[0] = "0, 0";
			
			
			
		}
		
	}

}
