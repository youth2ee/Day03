package com.naver.control4;

import java.util.Scanner;

public class Fortest5 {

	public static void main(String[] args) {
		//0분 0초 ~ 59분 59초 
		//분하고 초를 입력
		
		Scanner sc = new Scanner(System.in);
		
		int min=0;
		int sec=0;
	
		System.out.println("분");
		min = sc.nextInt();
		System.out.println("시");
		sec = sc.nextInt();
		
		/* 1) 이중구조반복문끝내기 : 조건식을 false값으로 만드는법
		for(int i=0;i<60;i++) {
			for(int j=0;j<60;j++) {
				System.out.println(i+":"+j);
				if(i==min && j==sec) {
					i=60;
					j=60;
				}
			}//안for
		}//밖for
		
		*/
		
		//2) ★★★ 이중구조반복문 끝내기 : break를 사용하는법
		boolean result =false;
		
		for(int i=0;i<60;i++) {
			for(int j=0;j<60;j++) {
				System.out.println(i+":"+j);
				
				if(i==min && j==sec) {
					//result=true;
					result=!result;
					break;
				}
			}//안for
			
			//if(result==true) {
			if(result) {
			break;
			}	//조건식 안이 true이면 실행됨. 
			
		}//밖for
			
		
		System.out.println("종료");
		
		
		}

	}


