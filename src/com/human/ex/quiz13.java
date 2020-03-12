//입력한 횟수만큼 안녕하세요?

package com.human.ex;

import java.util.Scanner;

public class quiz13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번이나 반복할까요?: ");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println("안녕하세요?");
		}
		
		sc.close();
	}

}
