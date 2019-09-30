package com.naver.control1;

public class Iftest8 {
	
	public static void main(String[] args) {
		//지역변수 (중괄호내에서 선언된 변수)
		//: 선언된 영역 내(중괄호 내)에서만 사용가능
		
		//1
		int num=1;
		if(num==1) { 
			int count=20;
		}else {
			int count=20; //위의 중괄호의 범위와 다르므로 또 count를 선언할 수 있다.
		}
		
		//2
		boolean check=true;
		if(check) { //()안의 값은 true false 기만 하면 된다.
		}else {}

		//3
		if(true) { 
		}else {}
		
		//int num=2;
		// 같은 중괄호 내에서 이미 선언되어 있으므로 선언할 수 없다.
		
		int count=30;
		// 같은 중괄호 내에서 선언되어 있지 않으므로 선언할 수 있다.
		
		System.out.println(num);
		
		//System.out.println(count); 
		//count는 if 내의 중괄호 내에 선언되어 있으므로 그 안에서만 사용가능
		//그영역을 벗어나면 사용할 수 없다.
		
	}//메인 메서드 끝

}
