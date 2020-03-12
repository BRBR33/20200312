//연료 증감

package com.human.ex;

import java.util.Scanner;

public class quiz25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a =1000;
		System.out.println("초기연료량 : "+a);
		while(a!=0) {
			System.out.print("연료 충전은 +로, 소모는 -로 입력해주세요 : ");
			int b = sc.nextInt();
			a = a+b;
			System.out.println("현재 남아 있는 양은 "+a+"입니다.");
			
			if(a!=0 && a<100) {
				System.out.println("(경고) 연료가 10%미만입니다.");
			}
			
		}
		System.out.println("(경고) 연료가 없습니다.");
		
		sc.close();
	}

}
