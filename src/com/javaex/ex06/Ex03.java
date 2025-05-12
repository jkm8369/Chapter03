package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		String s01 = new String("안녕하세요");
		String s02 = new String("안녕하세요");
		
		System.out.println(s01 == s02);         //주소가 같냐? new는 주소가 다르다
		System.out.println(s01.equals(s02));    //실제값이 같냐? equals()ek
		
		System.out.println("==========================");
		
		String s03 = "굿모닝";
		String s04 = "굿모닝";
		
		System.out.println(s03 == s04);       //주소가 같냐? 주소가 같다
		System.out.println(s03.equals(s04));  //주소가 같으니까 실제값은 당연히 같다
		
		System.out.println("==========================");
		s03 = "굿이브닝!!!!!";
		System.out.println(s03 == s04);     //주소가 달라진다
		System.out.println(s03.equals(s04));   //굿이브닝!!!!! 굿모닝 같니?
		
		System.out.println("==========================");
		
		String s05 = "안녕";
		if(s05.equals("안녕")) {
			System.out.println("같다");
		}
		
		System.out.println("==========================");
		
		s05 = null;
		if("안녕".equals(s05)) {           //순서를 바꿔쓰면 null point 예외 상황을 피할 수 있다
			System.out.println("같다");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
