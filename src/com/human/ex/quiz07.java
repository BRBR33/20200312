//랜덤숫자 맞추기

package com.human.ex;

import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		java.util.Random ran = new java.util.Random();
		int a = ran.nextInt(10);

		System.out.println("0부터 9까지의 숫자를 입력하세요.");
		for(int i=1;;i++) {
			System.out.print(String.format("[%d번째 도전] : ",i));
			int b = sc.nextInt();
			if(a>b) {
				System.out.println(b+"보다는 큽니다.");
			}else if(a<b) {
				System.out.println(b+"보다는 작습니다.");
			}else if(a==b) {
				System.out.println("우와! 정확합니다. "+i+"번째만에 맞췄군요!");
				break;
			}

			
		}
		sc.close();
	}

}
