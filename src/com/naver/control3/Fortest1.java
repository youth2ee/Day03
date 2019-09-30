package com.naver.control3;

import java.util.Scanner;

public class Fortest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//for(초기식;조건식;증감식){}
	
		System.out.println("횟수를 입력하세요");
		int count = sc.nextInt();
		
		for(int i=0 ; i<(count) ; i++) {
			System.out.println("hi");
		}
		

		int n = 3;
		//위에서 초기화를 이미 해준경우 
		//for문에서 초기식 안적을수 있다.
		for(; n<10 ; n++) {
			System.out.println("hi");
		}
		
		int num=1;
		for(int i=0 ; i<5 ; i=i+num) {
			System.out.println("hi");
		}
		
		
		
	    System.out.println("프로그램종료");
	}
}
