package com.naver.control5;

import java.util.Scanner;

public class Whiletest2 {

	public static void main(String[] args) {
		//ATM


		Scanner sc = new Scanner(System.in);

		boolean check = true;

		while(check) {
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 조회");
			System.out.println("4. 종료");
			int select = sc.nextInt();

			if(select==1) {
				System.out.println("입금코드진행");
			}else if (select==2) {
				System.out.println("출금코드진행");
			}else if (select==3) {
				System.out.println("조회코드진행");
				break;
			}else {
				System.out.println("종료");
				break;
				//check=false;
			}
		}



	}

}
