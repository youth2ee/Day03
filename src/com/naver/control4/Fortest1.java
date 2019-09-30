package com.naver.control4;

public class Fortest1 {

	public static void main(String[] args) {

		// for문 안에  for문 넣기
		//구구단만들기 2~4단
		
		for(int i=2;i<5;i++) {
			
			System.out.println("======<"+i+"단>=======");
			for(int j=1;j<10;j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				//"\t"는 tap만큼 띄워주세요
				//""를 쓰고싶을때 : """"(x) "\""(o)
				
				//println 프린트하고 엔터치는 것과 같다.
				//print 프린트하고 바로 옆으로 이어서 프린트된다.
				
			} //for문끝
			
			System.out.println();
			
		}//for문끝

	}

}
