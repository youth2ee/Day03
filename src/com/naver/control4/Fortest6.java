package com.naver.control4;

import java.util.Scanner;

public class Fortest6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//게임장르
		//FPS - 서든, 배틀...
		boolean result =false;
		
		for(int tan=0;tan<3;tan++) {
			System.out.println("1. 단발"); //1발 30번 90번
			System.out.println("2. 점사"); //3발 10번 30번
			int mode = sc.nextInt();
			
			String sound = "";
			int n=0;
			
			if(mode==1) {
				n=1;
				sound="탕";
				
			}else if (mode==2) {
				n=3;
				sound="타타탕";
			}
			
			for(int i=0;i<30;i=i+n) { // 수정X
				
				System.out.println(sound);
				
				/*
				switch (result) {
				case 1:
					System.out.println("탕");
					break;
				
				case 2:
					i = i*3;
					System.out.println("타타탕");
					break;
				}
				*/
				
				/*
				result = i%10;
				
				if(mode==1) {
					System.out.println("탕");
			
				}else if (mode==2 && result<=2) {
					System.out.println("타타탕");
				}
				*/
				
				/*
				if(mode==1) {
					n=1;
					System.out.println("탕");
			
				}else if (mode==2) {
					n=3;
					System.out.println("타타탕");
				}
				*/
				
				/*
				switch (n) {
				case 1:
					System.out.println("탕");
					result=true;
					break;
				
				case 3:
					System.out.println("타타탕");
					result=true;
					break;
				}
				*/

			}//안 for문끝
			
			if(result==true) {
				break;
			}
			
		}//밖 for문끝
		
	}//메인

}
