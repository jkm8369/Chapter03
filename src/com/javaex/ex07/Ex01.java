package com.javaex.ex07;

public class Ex01 {

	//메소드 일반
	public static void main(String[] args) {
		
		
		int a = 3;  // 기본
		System.out.println(a);
		
		System.out.println("=====================");
		
		Integer i = new Integer(3);
		System.out.println(i.toString());
		
		System.out.println("=====================");
		
		Integer sum = new Integer(3) + new Integer(3);
		System.out.println(sum);
		
		System.out.println("=====================");
		
		Integer v01 = 3;        //new Integer(3)  박싱
		System.out.println(v01.toString());
		
		System.out.println("=====================");
		
		Integer i01 = new Integer(999);    //i01은 주소 
		int b = i01;                       //언박싱
		System.out.println(b);
		
		System.out.println("=====================");
		
		//덜 좋은 방식 --> 필요없는 99를 넣어야 한다
		//Integer r01 = new Integer(100);
		Integer r01 = 100;    //박싱
		Integer result = r01.parseInt("12345");   //"12345" --> 12345
		System.out.println(result+3);
		
		System.out.println("=====================");
		
		//조금 더 좋은 방식 (문자열 --> 정수) static 공부
		Integer result02 = Integer.parseInt("12345");
		System.out.println(result02 + 1);
		
		System.out.println("=====================");
		//////////////////////////////////////////
		//정수 --> 문자열        12345 --> "12345"
		//덜 좋은 방식 --> 필요없는 "안녕"을 만들어야 한다
		String s = new String("안녕");
		String sNum = s.valueOf(12345);
		System.out.println(sNum + 1);
		
		//조금 더 좋은 방식 (정수, 실수 --> 문자열) static 공부
		String sNum2 = String.valueOf(12345.3);
		System.out.println(sNum2 + 1);
		//					(실수 --> 문자열) static 공부, 메소드 오버로딩
		String sNum3 = String.valueOf(12345.3343);
		System.out.println(sNum3 + 1);
		
		System.out.println("=====================");
		
		//숫자 --> 문자열
		//System.out.println(12345 + "1");
		//String sNum4 = 12345 + "";
		String sNum4 = "" + 999;
		System.out.println(sNum4 + 1);
		
		

	}
}
