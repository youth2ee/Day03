package com.naver.control2;

public class Switchtest1 {
	public static void main(String[] args) {
		
		int num=10;
		
		switch (num){ //()안에 정수식만온다.
		case 10: //반드시 정수형 상수가 와야 한다.
				System.out.println("10");
				break;
					//break나 중괄호가 끝
					//안쓰면 아래로 계속 진행된다.
		case 20:
				System.out.println("20");
				break;
		default://그외나머지(=else)
			System.out.println("그외 나머지");
			//굳이 break를 안써도 된다. 중괄호가 끝나면 스위치문 끝나므로.
		} //스위치문 끝
		
		
		if(num==10) {
			System.out.println("10");
		}else if(num==20) {
			System.out.println("20");
		}else {
			System.out.println("그외 나머지");
		} //if문 끝
		
		//자동형변환으로 char타입 넣어도 가능
		switch('a'){
			case 'b':
			break;
		}
		
		
		
		
		
		
	}//메인끝

}
