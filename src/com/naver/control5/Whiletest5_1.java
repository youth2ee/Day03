package com.naver.control5;

import java.util.Scanner;

public class Whiletest5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int id = 1234;
		int pw = 5678;
		boolean check = true;
		
		while(check) {
			System.out.println("1. 로그인");
			System.out.println("2. 종료");
			int select = sc.nextInt();
			//select를 밖에 선언하면 값이 그대로 남은채 반복된다.
			
			if (select==1) {
				System.out.println("ID");
				int id2 = sc.nextInt();

				System.out.println("PW");
				int pw2 = sc.nextInt();

				if(id2==id && pw2==pw) {
					System.out.println("로그인성공");
					check=false; //로그인 성공해서 종료한 것과 로그인 실패해서 종료한 것을 비교
				}
			}else {
				break; 
			}
		}//while
		
		if(!check) { //check값을 반대로 바꿔라 . 로그인성공시 false이므로 true값으로 바꿔준다.
			int level=1;
			int gold=0;
			
			for(level=1;level<15;level++) {
				
				if(level%5==0) {
					System.out.println("level "+level+"포상금지급");
					gold = gold + level/5*1000;
				}
				
				for(int mon=1;mon<=level*3;mon++) {
					System.out.println(mon + "마리사냥");
				}
				System.out.println("축 레벨업");
			}
			
			gold = gold +3000; //15레벨에는 for문 나오므로 15레벨일때 골드는 따로 더해준다.
			System.out.println("최종레벨 : "+level);
			System.out.println("최종골드 : "+gold);
			
			
			
		}//로그인 성공시 if문

	}//메인

}
