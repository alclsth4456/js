package test4;

import sub3.Apple;

public class test5 {

	public static void main(String[] args) {

		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("미국", 3000);
		Grape grape = new Grape("일본", 3000);
		
		showInfo(apple);
		showInfo(banana);
		showInfo(grape);
			
	}
	
	public static void showInfo(Object fruit) {  //객체 생성없이 호출하기위해 static 명시
		if(fruit instanceof Apple) {
			Apple apple = (Apple) fruit;
			System.out.println(apple);
			
		}else if(fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			System.out.println(banana);
		}
	}

}
