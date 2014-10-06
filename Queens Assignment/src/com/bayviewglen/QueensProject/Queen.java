package com.bayviewglen.QueensProject;

import java.util.Stack;

public class Queen {

	//Method to add a Queen to the stack and board
	public static void AddQueen(int xIndex, int yIndex, String[][]board, Stack<String> Que){
		
		// to place a Q where a queen is on the board.
		board[yIndex][xIndex] = " Q |";

		// to put a new queen into the stack
		Que.push("row" + Integer.toString(yIndex) + " " + "column" + Integer.toString(xIndex));
	}
	
	public static void outputBoard(int boardSize, String[][]allQueens){
		String dividingLine = "";
		for (int x = 0; x < boardSize; x++){
			dividingLine += "----";
		}
		
		
		for (int col = 0; col < boardSize; col++){
			System.out.println();
			System.out.println(dividingLine + "-");
			System.out.print("|");
			for (int row = 0; row < boardSize; row++){
				System.out.print(allQueens[col][row]);
				System.out.print("");
			}
		}
		System.out.println();
		System.out.println(dividingLine);
	}
}
