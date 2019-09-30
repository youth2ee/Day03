package com.naver.control1;

import java.util.Scanner;

public class Iftest6 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//sysout(또는 sout) + ctrl + space : 단축키

		System.out.println("숫자를 입력하시오(1~3)");
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.println("1번선택");
		}else if (select == 2) {
			System.out.println("2번선택");
		}else if (select == 3) {
			System.out.println("3번선택");
		}else {
			System.out.println("그 외의 숫자");
		}
		
				
	}
}
