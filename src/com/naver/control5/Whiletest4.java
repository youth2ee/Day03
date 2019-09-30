package com.naver.control5;

import java.util.Scanner;

public class Whiletest4 {

	public static void main(String[] args) {
		//1. 성적입력 국어 영어 수학
		//2. 평균출력
		//3. 총점출력
		//4. 종료

		Scanner sc = new Scanner(System.in);

		int cho=0;

		int kor=0;
		int eng=0;
		int math=0;
		int sum=0;
		// int sum = kor+eng+math; 바로 위의 kor, eng, math의 값들을 받아 0으로 지정됨
		// 입력으로 인해 생기는 데이터는 입력후에 계산해야 한다.
		int avg=0;
		boolean result =true;

		while(result) {
			System.out.println("1. 성적입력");
			System.out.println("2. 평균출력");
			System.out.println("3. 총점출력");
			System.out.println("4. 종      료");
			cho = sc.nextInt();

			switch(cho) {
			case 1:
				System.out.println("국어");
				kor = sc.nextInt();
				System.out.println("영어");
				eng = sc.nextInt();
				System.out.println("수학");
				math = sc.nextInt();
				break;

			case 2:
				avg=(kor+eng+math)/3; //아직 sum값이 계산된게 아니므로 
				System.out.println(avg);
				break;

			case 3:
				sum=kor+eng+math;
				System.out.println(sum);
				break;

			case 4:
				//while문 안이므로 break못쓴다.
				//result=false;
				result=!result;

			}


			/*
				if(cho==1) {
					System.out.println("국어");
					kor = sc.nextInt();
					System.out.println("영어");
					eng = sc.nextInt();
					System.out.println("수학");
					math = sc.nextInt();

					sum=kor+eng+math;
					avg=sum/3;

					result=true;

				}else if(cho==2) {
					System.out.println(avg);
					result=true;

				}else if(cho==3) {
					System.out.println(sum);
					result=true;

				}else if(cho==4) {
					break;
				}//if문 끝
			 */

		}//while문

	}//메인

}
