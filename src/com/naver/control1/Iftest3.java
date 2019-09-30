package com.naver.control1;

import java.util.Scanner;

public class Iftest3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/* 
		 * 월급여와 나이를 입력 
		 * 급여 
		 * 200만원~ 300만원 미만 소득세 2.3%
		 * 300이상~ 400미만 소득세 2.9%
		 * 400만이상은 소득세 3.5%
		 */
		
		int money =0;
		int age =0;
		double real=0.0;
		double tax1=0.0; //소득세
		double tax2=0.0; //세금 

		System.out.println("월급을 입력하세요");
		money = sc.nextInt();
		
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		
		System.out.println("월급 : "+money+"원");
		System.out.println("나이 : "+age+"살");
		
		if(money>=2000000 && money<3000000) { 
			tax1=0.022;
			//real = money-(money*0.022);
		}
		if(money>=3000000 && money<4000000) { 
			tax1=0.03;
			//real = money-(money*0.03);
		}
		if(money>=4000000) { 
			tax1=0.035;
			//real = money-(money*0.035);
		}
	
		if(age>=20 && age<30) { 
			tax2=0.012;
			//real = real-(real*0.012);
		}
		if(age>=30 && age<40) { 
			tax2=0.02;
			//real = real-(real*0.02);
		}
		if(age>=40) { 
			tax2=0.04;
			//real = real-(real*0.04);
		}

		real = money-money*tax1;
		System.out.println("소득세를 제외한 월급 : "+(int)real+"원");

		real = real -real*tax2;
		System.out.println("모든 세금을 제외한 월급 : "+(int)real+"원");

		//변수를 바꾸게 하고, 식은 마지막에 하나

	}

}
