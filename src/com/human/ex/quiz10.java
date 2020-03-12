//시험점수 입력하기 , 0입력하면 종료

package com.human.ex;

import java.util.Scanner;

public class quiz10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("시험 점수를 입력하세요.");
		int a = 0;
		int sum = 0;
		while (true) {
			a = sc.nextInt();
			sum = sum + a;
			if(a==0) break;
		}
		System.out.println("시험 점수의 합계는 " + sum + "입니다.");
		sc.close();
	}

}
