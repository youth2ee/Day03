package com.naver.control3;

import java.util.Scanner;

public class Fortest6 {

	public static void main(String[] args) {
		//인터넷뱅킹 로그인
		//아이디, 패스워드
		//횟수제한 5번
		//맞으면 종료
		
		Scanner sc = new Scanner(System.in);
		int id=1234; //회원가입시 id
		int pw=5678; //회원가입시 pw
		int id2=0;
		int pw2=0;
		
		//로그인과정
		boolean pass = true;
		
		for(int i=1;i<6;i++) {
			//로그인과정
			System.out.println("id");
			id2 = sc.nextInt();
			System.out.println("pw");
			pw2 = sc.nextInt();
			
			//로그인 검증과정
			if(id==id2 && pw==pw2) { //로그인성공
				pass=true;
				// i=5; //로그인 성공시에 바로 종료되게 하는 것
				break;  //로그인 성공시에 바로 종료되게 하는 것
				
			}else { //로그인실패
				System.out.println("남은 로그인 횟수 : "+(5-i)+"회");
				System.out.println("=========================");
				pass=false;
			} //if문 끝
		} //for문 끝
				
		//로그인 성공 : 은행업무 시작 출력
		if(pass==true) { //로그인 성공시
			System.out.println("로그인 성공");
			System.out.println("은행업무 시작");
		}else if (pass==false) { //로그인 실패시
			System.out.println("로그인 실패");
		}

	} //main 끝
}

	
