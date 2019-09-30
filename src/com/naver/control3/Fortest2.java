package com.naver.control3;

import java.util.Scanner;

public class Fortest2 {

	public static void main(String[] args) {
		
		/*
		//for문 내에서 선언된 n은 for문 내에서만 사용가능한 지역변수
		for(int n=0 ; n<10 ; n++) {
			System.out.println("첫번째");
			System.out.println(n);
		}

		//for문 밖에서 선언된 변수는 자유롭게 사용가능
		int m=0;
		for(; m<10 ; m++) {
			System.out.println("두번째");
		}
		System.out.println(m); //10
		*/
		
		Scanner sc = new Scanner(System.in);
		
		//구구단
		int num=1;
		System.out.println("단수를 입력하시오");
		num = sc.nextInt();
		
		for(int n=1;n<10;n++) {
			System.out.println(num+" * "+n+" = "+num*n);
		}

		
		//0~9까지의 합을 계산, 누적함수사용
		int sum=0;
		int result=0;
		for(;sum<10;sum++) {
			result= result+sum;
		}
		System.out.println(result);
		
		
		//1부터 100사이의 숫자 중에서 홀수만 출력하세요
		for(int a=1;a<=100;a++) {
			if(a%2 == 1) {
				System.out.println(a);
			}
		}
		
		
	} //메인메서드
	
}

