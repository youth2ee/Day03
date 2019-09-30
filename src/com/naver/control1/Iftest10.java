package com.naver.control1;

import java.util.Scanner;

public class Iftest10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//게임 
		//로그인 
		//캐릭터선택
		
		int id=1234; //회원가입시 id
		int pw=5678; //회원가입시 pw
		int id2=0; //새로 로그인시에 입력받을 아이디
		int pw2=0; //새로 로그인에 입력받을 패스워드
		
		//id는 string으로 받아야 하지만
		//아직 string같게 하는 법 안배움
		
		boolean login = true; //로그인이 성공인지 실패인지
		int select=0; //캐릭터 선택번호
		String name =""; //선택된 캐릭터
		
		//로그인 진행코드
		//위에 입력된 아이디와 패스워드와 같아야 로그인 성공
		System.out.println("아이디입력");
		id2 = sc.nextInt();
		
		System.out.println("비밀번호입력");
		pw2 = sc.nextInt();

		
		if(id == id2 && pw == pw2) {
			System.out.println("-> 로그인성공");
			//login = true;
			login = login;
			// 위에서 login의 초기값이 false면,
			// login = !login;으로 물어봐야 한다.
		}else {
			System.out.println("-> 로그인 실패");
			login=false;
		}
		
		//캐릭터 선택
		//위에서 로그인 성공시,
		//마법사, 궁수, 전사, 다음에 선택
		//로그인 실패시에는 그냥 종료
		if(login == true) {
			System.out.println("=============");
			System.out.println("캐릭터를 선택하시오");
			System.out.println("1. 마법사");
			System.out.println("2. 궁수");
			System.out.println("3. 전사");
			System.out.println("4. 다음에 선택");
		
			select = sc.nextInt();
		
			if(select==1) {
				name="마법사";
			}else if (select==2) {
				name="궁수";
			}else if (select==3) {
				name="전사";
			}else {
				name="없음";
			}
		
			System.out.println("선택한 캐릭터 : "+name);
		}else {}
		
		System.out.println("프로그램 종료");
		
	}
}
