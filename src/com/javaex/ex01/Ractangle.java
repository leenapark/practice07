package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	
	
	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public void draw(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + " 그렸습니다.");                                                                        
	}

	public void hei() {
		System.out.println("sr1의 가로는 " + height + " 입니다.");
	}



}


