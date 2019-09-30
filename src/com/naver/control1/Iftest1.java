package com.naver.control1;

public class Iftest1 {

	
	public static void main(String[] args) {
		/* 단일 if문
		 * 형식 : if(조건식){트루이면 한다.}
		 */
		
		int age = 20;
		String result ="미성년";
		String result2="10대가 아닙니다.";
		
		if(age>=20){result="성년";} 
		//트루가 아닐때에는 작동하지 않고 원값을 그대로 프린트한다.
		
		//10대 판별코드
		if(age<20 && age>=10) {result2="10대 입니다.";}

		System.out.println(result);
		System.out.println(result2);
	}

}
