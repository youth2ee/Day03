package com.naver.control3;

import java.util.Scanner;

public class Fortest7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int select=3;
		
		for(int i=0;i<10;i++) {
	
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 종료");
			select = sc.nextInt();
				
			switch(select) {
				case 1:
				System.out.println("입금코드를 작성하세요");
				break;
				
				case 2:
				System.out.println("출금코드를 작성하세요");
				break;
				
				default:
				System.out.println("안녕히 가세요");
				i=9; //switch에서 for문을 종료시키는법
				
				} 
			//switch문 안의 break는 반복문 안에 있더라도 switch문만 벗어난다.
			//즉 switch안의 break는 보조문으로서 break로는 작동하지 않는다.

			
			
		} //for문 종료
			

		System.out.println("프로그램종료");
		
	}

}
