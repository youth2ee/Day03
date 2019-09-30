package com.naver.control5;

import java.util.Scanner;

public class Whiletest5 {

	public static void main(String[] args) {
		//1. 로그인 검증
		//2. 로그인이 된다면 성공했을때 실행 , 로그인이 실패하면 종료
		//3. 실행할 것은 MMO RPG
		//4. 시작레벨 : 1
		//5. 마지막레벨 : 15
		//모든 몬스터의 경험치는 동일하다
		//1에서 2로 가기위해서는 사냥을 해야한다.
		//몬스터를 3마리를 사냥하면 2레벨로 렙업
		//몬스터를 6마리를 사냥하면 3레벨로 렙업
		//몬스터를 9마리를 사냥하면 4레벨로 렙업
		//몬스터를 12마리를 사냥하면 5레벨로 렙업
		//14에서 15레벨까지 
		//보상 : 5렙 달성시, 돈(1000골드)을 줍니다
		// 10렙 달성시 2000골드 지급
		// 15렙 달성시 3000골드 지급
		// 만렙달성시에 마지막에 내가 가진 골드를 보여주세요
		// 추가 :렙업시 1->2, 계속 사냥할꺼냐 종료할거냐고 물어봐주세요 

		//로그인 검증

		int id=1234;
		int pw=5678;
		int id2=0;
		int pw2=0;
		boolean result =true;
		boolean result2=false;
		int money =0;
		int num=0;
		int i=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("아이디");
		id2 = sc.nextInt();
		System.out.println("비밀번호");
		pw2 = sc.nextInt();

		if(id2==id && pw2==pw) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
			result=false;
		}

		//로그인 성공시 레벨이 15까지한다. i는 레벨
		if(result) {
			for(i=1;i<15;i++) { //레벨이 15가 되면 종료한다.
				System.out.println("============================");

				//사냥마리수
				for(int j=1;j<=3*i;j++) {
					System.out.println(j+"마리 사냥");
				}//안 for 끝

				System.out.println("레벨"+(i+1)+"달성");

				//골드 지급
				if(i==4) {
					System.out.println("1000골드가 지급되었습니다.");
					money+=1000;
				}else if (i==9) {
					System.out.println("2000골드가 지급되었습니다.");
					money+=2000;
				}else if (i==14) {
					System.out.println("3000골드가 지급되었습니다.");
					money+=3000;
				}

				if(i!=14) {
					System.out.println("게임을 계속하시겠습니까?");
					System.out.println("1. 계속");
					System.out.println("2. 종료");
					num = sc.nextInt();

					if(num==1) {
					} else if(num==2) {
						result2=true;
						break;
					}
				} else if (i==14) {
					System.out.println("모든 레벨을 클리어 하셨습니다.");
					System.out.println("보유골드 : "+money+"골드");
				}

			}//밖 for 끝

		}//if문 끝

	}//메인메서드
}


