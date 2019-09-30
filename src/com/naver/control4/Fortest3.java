package com.naver.control4;

public class Fortest3 {
	
	public static void main(String[] args) {
		//*찍기
		/* 
		*****
		*****
		*****
		*****
		*****
	    */
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println(); //다음부터 아래로 찍게된다.
		}
		
		/* 
		*
		**
		***
		****
		*****
	    */
		
		/*
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
				if(i==j) {
					break;
				}
			}
			System.out.println();
		}
		*/
		
		System.out.println("1번");
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("2번");
		for(int i=0 ; i<5 ; i++) {
			for(int j=i ; j>=0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* 
		*****
		****
		***
		**
		*
	    */
		
		System.out.println("3번");
		for(int i=0 ; i<5 ; i++) {
			for(int j=5-i ; j>=1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		}

}
