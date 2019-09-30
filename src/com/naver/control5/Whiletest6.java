package com.naver.control5;

import java.util.Scanner;

public class Whiletest6 {

	public static void main(String[] args) {
		/*
		햄버거 키오스크
		1. 메뉴가 출력 메뉴를 선택하세요 - 햄버거/사이드/음료
		햄버거 : 1)와퍼(6000원) 2)몬스터와퍼(8000원) 3)치킨버거(4000원)
		사이드 : 4)감자튀김(2000원) 5)치킨너겟(3000원) 6)치즈스틱(1000원)
		음료 : 7)콜라(1500원) 8)커피(1000원)

		2. 메뉴를 하나를 고른다.(1~8) + 수량을 선택합니다.
		메뉴선택 3
		수량선택 1

		3. 추가주문 할꺼냐?
		 1) 추가주문 O -> 다시 메뉴화면으로 반복됩니다. 추가할것을 고른다. 1,2,3 다시 묻는다.
		 2) 추가주문 X (종료) -> 주문한 정보를 출력해준다.

		4. 추가주문이 없을시 주문정보를 출력
		  와퍼 1개
		  가격 6000원

		 치킨버거 3개
		 가격 12000원 

		 총합계 18000원

		 다시 메뉴가 뜨도록합니다.

		 */

		Scanner sc = new Scanner(System.in);

		int choice = 0;
		int count=0;
		int n=0;
		int total=0;
		boolean result=true;
		String mN="";
		int mP=0;
		String alltotal="";


		while(result==true) {

			System.out.println("메뉴");
			System.out.println("햄버거 : 1)와퍼(6000원) 2)몬스터와퍼(8000원) 3)치킨버거(4000원)");
			System.out.println("사이드 : 4)감자튀김(2000원) 5)치킨너겟(3000원) 6)치즈스틱(1000원)");
			System.out.println("음료 : 7)콜라(1500원) 8)커피(1000원)");

			System.out.println("메뉴를 고르세요");
			choice = sc.nextInt();


			System.out.println("수량을 적으세요");
			count = sc.nextInt();

			System.out.println("추가주문을 하시겠습니까?");
			System.out.println("1. 추가주문을 하겠습니다.");
			System.out.println("2. 추가주문을 하지 않겠습니다.");
			n=sc.nextInt();


			if(choice==1) {
				mN="와퍼";
				mP=6000;
			}else if(choice==2) {
				mN="몬스터와퍼";
				mP=8000;
			}else if(choice==3) {
				mN="치킨버거";
				mP=4000;
			}else if(choice==4) {
				mN="감자튀김";
				mP=2000;
			}else if(choice==5) {
				mN="치킨너겟";
				mP=3000;
			}else if(choice==6) {
				mN="치즈스틱";
				mP=1000;
			}else if(choice==7) {
				mN="콜라";
				mP=1500;
			}else if(choice==8) {
				mN="커피";
				mP=1000;
			}


			if(n==1) {
				result=true;


				System.out.println(mN);
				System.out.println(mP*count);


			}else if(n==2){
				break;
			}

		}

		if(choice==1) {
			System.out.println("와퍼"+count+"개");
			total=count*6000;
			System.out.println(total);

		}else if(choice==2) {
			System.out.println("몬스터와퍼"+count+"개");
			total=count*8000;
			System.out.println(total);

		}else if(choice==3) {
			System.out.println("치킨버거"+count+"개");
			total = count*4000;
			System.out.println(total);

		}else if(choice==4) {
			System.out.println("감자튀김"+count+"개");
			total = count*2000;
			System.out.println(total);

		}else if(choice==5) {
			System.out.println("치킨너겟"+count+"개");
			total = count*3000;
			System.out.println(total);

		}else if(choice==6) {
			System.out.println("치즈스틱"+count+"개");
			total = count*1000;
			System.out.println(total);

		}else if(choice==7) {
			System.out.println("콜라"+count+"개");
			total = count*1500;
			System.out.println(total);

		}else if(choice==8) {
			System.out.println("커피"+count+"개");
			total = count*1000;
			System.out.println(total);
		}

		System.out.println("총합계 : "+total);


















	}//메인 
}
