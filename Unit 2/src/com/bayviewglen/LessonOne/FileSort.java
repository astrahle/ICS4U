package com.bayviewglen.LessonOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileSort {

	public static void main(String[] args) throws FileNotFoundException {
		String[] allWords = new String[1000];
		int wordCount = 0;
		Scanner input = new Scanner(new File ("inputs/data.txt"));


		while (input.hasNext()){
			String word = input.next();
			allWords[wordCount] = word;
			wordCount++;
		}

		String[] newArray = new String[wordCount];

		for (int x=0; x<wordCount; x++){
			newArray[x] = allWords[x];
		}

		Arrays.sort(newArray);

		for(int a = wordCount - 1; a>=0; --a){
			System.out.println(newArray[a]);
		}

		System.out.println("*****************************************************");

		allWords = new String[wordCount -1];

		for (int i=0; i<wordCount-1; i++){
			allWords[i] = newArray[i];
		}

		for (int i=allWords.length-1; i>=0; i--){
			System.out.println(allWords[i]);
		}

		input.close();	

	}

}
