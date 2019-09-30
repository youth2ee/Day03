package com.naver.control1;

import java.util.Scanner;

public class Iftest7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor=0;
		int eng=0;
		int math=0;
		int sum=0;
		int avg=0;
		
		System.out.println("국어점수를 입력");
		kor = sc.nextInt();
		
		System.out.println("영어점수를 입력");
		eng = sc.nextInt();
		
		System.out.println("수학점수를 입력");
		math = sc.nextInt();
		
		sum = kor+eng+math;
		avg = sum/3;
		String result ="";
		
		System.out.println(avg);
		
		if(avg>=90) {
			result="A";
		}else if (avg>=80) {
			result="B";
		}else if (avg>=70) {
			result="C";
		}else if (avg>=60) {
			result="D";
		}else {
			result="F";
		}
		
		System.out.println(result);
		
		/*
		if(avg>=90) {
			System.out.println("A");
		}else if (avg>=80) {
			System.out.println("B");
		}else if (avg>=70) {
			System.out.println("C");
		}else if (avg>=60) {
			System.out.println("D");
		}else {System.out.println("F");}
		*/
		

	}//메인의 끝
	//중괄호 주의합시다
}
