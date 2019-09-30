package com.naver.control3;

import java.util.Scanner;

public class Fortest4 {
	public static void main(String[] args) {
		//원하는 수를 입력받아서 
		//0부터 입력한 수 까지의 합을 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		System.out.println("숫자를 입력");
		num = sc.nextInt();
		
		for(int i=0 ; i<=num ; i++) {
			sum = sum+i;
			System.out.println(i);
		}
		
		/*
		for(int i=0 ; i<(num+1) ; i++) {
			sum = sum+i;
			System.out.println(i);
		}
		*/
		
		System.out.println(sum);
		
	}
}
