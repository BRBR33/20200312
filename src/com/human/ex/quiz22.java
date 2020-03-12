//양수음수판별, 절댓값 구하기

package com.human.ex;

import java.util.Scanner;

public class quiz22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("양수와 음수의 절댓값을 구하는 프로그램 입니다.");
		System.out.println("0을 입력하면 프로그램을 종료합니다.");
		
		System.out.print("[입력] => ");
		int a = sc.nextInt();
		while(a!=0) {
			if(a>0) {
				System.out.println("양수군요. 절댓값은 "+a+"입니다.");
			}else {
				System.out.println("음수군요. 절댓값은 "+(-a)+"입니다.");
			}
			System.out.print("[입력] => ");
			a = sc.nextInt();
		}
		
		
		sc.close();
	}

}
