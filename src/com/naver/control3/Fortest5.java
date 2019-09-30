package com.naver.control3;

import java.util.Scanner;

public class Fortest5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//반복적으로 돌아가는 것
		//타이머를 맞춘다 0부터 60미만의 초를 입력받는다.
		
		int time =0;
		System.out.println("초를 입력하시오");
		time = sc.nextInt();

		
		for(int sec=0; sec<60; sec++) { //수정불가
			System.out.println(sec+"초");
			if(sec==time) {
				//sec=60;
				break; //break 쓰면 바로 종료된다.
			} //sec<60이라는 조건문이 false이면 종료.
			  //sec=59여도 종료가능. 왜냐하면 증감식을 먼저 거치기 때문.
			  //sec=59면 1더해지고 sec=60일때 조건식을 만족하는지 묻기 때문에
			  //false가 되기때문에 for문은 종료된다.
		}
		
		
	}
}
