package com.naver.control3;

import java.util.Scanner;

public class Fortest3 {
	public static void main(String[] args) {
		
		//학생들의 인원수를 입력받는다.
		//각 학생의 나이를 입력받는다.
		//3명이면 3번의 나이를 입력받아야 한다.
		//평균나이를 출력
	
		Scanner sc = new Scanner(System.in);
		
		int num =0;
		int age =0;

		int sum =0;
		
		System.out.println("인원수");
		num = sc.nextInt(); 
		
		for(int i=0; i!=num ; i++) {
			System.out.println("나이");
			age = sc.nextInt();
			sum = sum+age;
		}
		// i==num이면 한번 돌고나서 false이므로 
		// true값 만들기위해서는 i!=num해야한다.
		// 그냥 종료함
		
		/*
		  	for(int i=0; i<count ; i++) {
			System.out.println("나이");
			age = sc.nextInt();
			sum = sum+age;
		 */

		System.out.println("평균나이 : "+sum/num);
		
		
	}

}
