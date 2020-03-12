//입력한 두 수 사이(두 수 포함)의 모든 정수들의 합

package com.human.ex;

import java.util.Scanner;

public class quiz15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요: ");
		int b = sc.nextInt();
		int sum = 0;
		if (a >= b) {
			for (int i = b; i <= a; i++) {
				sum = sum + i;
			}
		} else {
			for (int i = a; i <= b; i++) {
				sum = sum + i;
			}
		}
		System.out.println("두 수 사이의 합은:"+sum);

		sc.close();
	}

}
