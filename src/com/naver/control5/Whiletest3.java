package com.naver.control5;

import java.util.Scanner;

public class Whiletest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		//로그인검증
		int id = 1234;
		int pw = 5678;
		int id2 =0;
		int pw2=0;
		int q1=0; //로그인여부묻기
		boolean result=false; //로그인실패시 반복할ㄲㅓ니


		while(result==false) {
			System.out.println("로그인하시겠습니까");
			System.out.println("1. 로그인");
			System.out.println("2. 종료");
			q1 = sc.nextInt();

			if(q1==1) {
				System.out.println("id");
				id2 = sc.nextInt();
				System.out.println("pw");
				pw2 = sc.nextInt();

				if(id2==id && pw2==pw) {
					System.out.println("로그인성공");
					break;
				}else { 
					System.out.println("로그인실패");


				}}else if (q1==2) {
					System.out.println("로그인종료");
					break;
				}

		}}}







