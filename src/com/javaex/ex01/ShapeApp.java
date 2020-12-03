package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		s[0] = c1;
		s[1] = r1;
		s[2] = sr1;
		
		//sr1을 그리는 메소드 호출
		sr1.draw(); //<-- 다른 표현 s[2].draw();
		//sr1의 가로크기 출력
		sr1.hei(); //<-- 다른 표현 s[2].hei();
	}
}

	
	