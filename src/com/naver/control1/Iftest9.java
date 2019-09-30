package com.naver.control1;

import java.util.Scanner;

public class Iftest9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//점심메뉴 고르기
		//짜장면, 돈가스, 햄버거, 라면
		//인원수 입력
		//최종결제금액출력
		//4명당 1인분 무료
		
		// primitive type 값은 같으면 무조건 true나온다.
		// String은 값이 같아도 false라고 나올 수 있다. 
		
		int select=0; //메뉴선택번호
		int money=0; //선택된 메뉴의 가격
		int people=0; //인원수
		int result=0; //총 결제금액 (인원*가격)
		String menu=""; //선택된 메뉴
		int n =0; // 4명당 1명은 공짜일 경우, 할인받을 사람의 명수
		
		System.out.println("1. 짜장면(5000원)");	
		System.out.println("2. 돈가스(8000원)");
		System.out.println("3. 햄버거(4000원)");
		System.out.println("4. 라면(3000원)");
		System.out.println("5. 종료");
		
		System.out.println("메뉴를 고르세요");
		select = sc.nextInt();
		
		if(select == 1) {
			money=5000;
			menu="짜장면";
		}else if(select ==2) {
			money=8000;
			menu="돈가스";
		}else if(select ==3) {
			money=4000;
			menu="햄버거";
		}else if(select ==4) {
			money=3000;
			menu="라면";
		}
		
		System.out.println("인원수를 입력하세요");
		people = sc.nextInt();
		
		/*
		result = money*people;
		System.out.println("총금액 : "+result+"원");
		*/
		
		n = people/4;
		
		System.out.println("선택된 메뉴 : "+menu);
		System.out.println("인원수 : "+people+"명");
		System.out.println("할인된 인원 : "+n+"명");
		System.out.println("할인된 금액 : "+money*n+"원");
		System.out.println("총금액 : "+money*(people-n)+"원");
		

	}//메인메서드 끝
}
