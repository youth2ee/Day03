package com.naver.control1;

import java.util.Scanner;

public class Selftest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a =0;
		int b =0;
		String name="";
		
		System.out.println("점수를 입력하세요");
		a = sc.nextInt();
		
		System.out.println("나이를 입력하세요");
		b = sc.nextInt();
		
		
		int ch = 0;
		String test ="";
				
		//if(a>40) {if(b>10 && b<=20) {ch='c';}{ch='d';}}
		//{ch='e';}
		
		if(b>10 && b<=20) {ch=1;}
		else {ch=25;}
		System.out.println(ch);

		}

		
	

	}
