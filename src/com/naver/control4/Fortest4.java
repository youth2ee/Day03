package com.naver.control4;

public class Fortest4 {
	public static void main(String[] args) {
		
		int num = 3;
		
		for (int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(i+":"+j);
				if (j==num) {
					break;
					
					//다중 반복문에서 break를 만나면 가장 가까운 반복문만 벗어난다.
					//안쪽 for문만 종료된다.
				}
				
			}//안for끝
	
		}//밖for끝
		
		System.out.println("프로그램종료");
		
		
	}

}
