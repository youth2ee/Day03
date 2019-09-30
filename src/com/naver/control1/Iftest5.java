package com.naver.control1;

import java.util.Scanner;

public class Iftest5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//국어영어수학점수를 받아서 
		//평균 60점이상이면 통과 아니면 탈락
		
		int kor=0;
		int eng=0;
		int math=0;
		int avg=0;
		
		System.out.println("국어점수를 입력하세요");
		kor = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요");
		eng = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		math = sc.nextInt();
		
		avg = (kor+eng+math)/3;
		System.out.println(avg+"점");
		
		if(avg>=60 && kor>=40 && eng>=40 && math>=40) {
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}

	}
}
