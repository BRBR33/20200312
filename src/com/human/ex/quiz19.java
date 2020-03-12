//입력한 수의 구구단 역순 출력

package com.human.ex;

import java.util.Scanner;

public class quiz19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단을 입력하세요: ");
		int a = sc.nextInt();
		for(int i=9;i>0;i--) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
		
		sc.close();
	}

}
