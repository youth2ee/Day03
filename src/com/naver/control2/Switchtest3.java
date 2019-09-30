package com.naver.control2;

import java.util.Scanner;

public class Switchtest3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor=0;
		int eng=0;
		int math=0;
		int sum=0;
		int avg=0;
		
		System.out.println("국어점수");
		kor = sc.nextInt();
		
		System.out.println("영어점수");
		eng = sc.nextInt();
		
		System.out.println("수학점수");
		math = sc.nextInt();
		
		sum= kor+eng+math;
		avg= sum/3;
		
		System.out.println("평균 : "+avg+"점");
		
		int n = avg/10;
		
		switch(n) {
		case 10:
		case 9:
			System.out.println("학점 : A");
			break;
			
		case 8:
			System.out.println("학점 : B");
			break;
			
		case 7:
			System.out.println("학점 : C");
			break;
			
		case 6:
			System.out.println("학점 : D");
			break;
			
		default:
			System.out.println("학점 : F");
	
		}

	}//메인

}
