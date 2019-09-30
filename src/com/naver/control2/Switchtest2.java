package com.naver.control2;

import java.util.Scanner;

public class Switchtest2 {
	
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
		
		System.out.println("평균"+avg);
		
		int result =0;
		
		if(avg>=90) {
			result=1;
		}else if(avg>=80 && avg<90) {
			result=2;
		}else if(avg>70 && avg<80) {
			result=3;
		}else if(avg>=60) {
			result=4;
		}else {
			result=5;
		}
		
		switch (result) {
		case 1:
			System.out.println("A");
			break;
		
		case 2:
			System.out.println("B");
			break;
			
		case 3:
			System.out.println("C");
			break;
			
		case 4:
			System.out.println("D");
			break;
			
		default:
			System.out.println("F");
		}
		

	}

}
