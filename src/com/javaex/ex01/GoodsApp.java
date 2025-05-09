package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		//모든 클래스의 부모는 Object이다
		Goods camera = new Goods();
		camera.hashCode();  //내가 만든 메소드가 아님
		                    //부모 Object 클래스의 메소드
		
		Object obj = new Object();
		System.out.println(obj.getClass());      //class java.lang.Object        클래스정보
		System.out.println(obj.toString());      //java.lang.Object@28a418fc     출력정보
		System.out.println(obj.hashCode());      //681842940                     당분간 주소라고 생각하자 0x333
		System.out.println(camera.equals(obj));  //false                         두개가 같냐?
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Goods camera = new Goods("니콘", 400000);
		
		
		Goods cup = new Goods("머그컵", 2000);
		Goods computer = new Goods("LG그램", 1000000);
		
		Goods[] gArray = new Goods[3];
		
		gArray[0] = camera;
		gArray[1] = cup;
		gArray[2] = computer;
		
		for(int i=0; i<gArray.length; i++) {
			System.out.println(gArray[i].toString());
		}
		*/
		
		
		
	}

}
