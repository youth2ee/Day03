package com.naver.control1;

import java.util.Scanner;

public class Iftest2 {
	public static void main(String[] args) {
		//main + ctrl + spacebar 하면 뜬다
		
		Scanner sc = new Scanner(System.in);

		//국어 영어 수학의 점수를 입력
		//평균계산
		//90점이상이면 우등상 수상출력
		
		int kor=0;
		int eng=0;
		int math=0;
		int sum=0;
		int avg=0;

		System.out.println("국어점수를 입력하세요");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = sc.nextInt();
		
		sum = kor+eng+math;
		avg = sum/3;

		if(avg>=90) {
			if(avg>=95){
				System.out.println("장학금수상");
			}
			System.out.println("우등상수상");
		}
		//중괄호{}를 안쓰는 경우도 있다. 안쓰는 경우는 if문 바로 아래문장만 중괄호안에 들어간것으로 인식한다.
		//평균이 95점 이상인 학생은 장학금 수상. 중괄호 안에 또 중괄호 가능.
		
		System.out.println("평균 : "+avg+"점");
		System.out.println("졸업");
		
	}

}
