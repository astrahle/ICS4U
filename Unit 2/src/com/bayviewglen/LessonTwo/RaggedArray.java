package com.bayviewglen.LessonTwo;

public class RaggedArray {
	
	public static void main(String[] args) {
		int[][] arr = {
				{10, 11, 12, 13},
				{14, 15, 16},
				{18, 19},
				{22}
			};
		
		display(arr);
		System.out.println();
		System.out.println("The sum of the ragged array is: " + sumRaggedArray(arr));
	}
	
	public static int sumRaggedArray(int[][] arr){
		int sum = 0;
		
		for (int i=0; i<arr.length; ++i){
			for (int j=0; j<arr[i].length; ++j){
				sum += arr[i][j];
			}
		}
		
		return sum;
	}
	
	public static void display(int[][] arr){
		for (int i=0; i<arr.length; ++i){
			for (int j=0; j<arr[i].length; ++j){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
