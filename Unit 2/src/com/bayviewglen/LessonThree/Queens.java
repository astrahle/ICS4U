package com.bayviewglen.LessonThree;

public class Queens {

	private int indexX;
	private int indexY;
	
	public Queens(){
		indexX = 0;
		indexY = 0;
	}
	
	public Queens(int index, int index2){
		index = indexX;
		index2 = indexY;
	}
	
	public int getXValue(){
		return indexX;
	}
	
	public int getYValue(){
		return indexY;
	}
	
	public void setXValue(int newX){
		indexX = newX;
	}
	
	public void setYValue(int newY){
		indexY = newY;
	}
}
