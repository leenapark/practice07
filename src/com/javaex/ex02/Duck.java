package com.javaex.ex02;

public class Duck extends Bird {
	/*
	//필드
	private String sing;
	private String fly;

	//생성자
    public Duck(String name, String sing, String fly) {
		super(name);
		this.sing = sing;
		this.fly = fly;
	}
	메소드 일반만 사용 사능하다 sing과 fly는 따로 값이 필요하지 않기 때문에 필드와 생성자를 따로 만들지 않아도 된다 --> 제대로 이해한 게 맞는지 추가 공부 필요
	*/
	
    public void sing() {
    	System.out.println("오리(" + getName() + ")가 소리내어 웁니다.");
    }
	
	public void fly() {
		System.out.println("오리(" + getName() + ")가 날지 않습니다.");
    }
       
    
    public void showName() {
    	System.out.println("오리의 이름은 " + getName() + " 입니다.");
    }

}
