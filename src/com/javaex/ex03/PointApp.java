package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 3;
		int c = 6;
		
		System.out.println(a==b);  //true
		System.out.println(a==c);  //false
		
		System.out.println("----------------------");
		
		
		Point p01 = new Point(3, 6);
		Point p02 = new Point(3, 6);  // 주소가 달라
		
		System.out.println(p01==p02);
		
		System.out.println(p01.equals(p02));
		
		
		
		
		/*
		//주소 값이 같은 경우
		Point p03 = p01;   //같은 주소를 복사
		System.out.println(p03==p01); // 주소 값이 같냐?
		*/
		
		
		
		
		
		
	}

}
