//랜덤 문제풀기

package com.human.ex;

import java.util.Random;
import java.util.Scanner;

public class quiz34 {

	public static void main(String[] args) {

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int countC = 0;
		int countM = 0;
		while (true) {
			int a = rn.nextInt(100);
			int b = rn.nextInt(100);
			
			System.out.print(a + "+" + b + "=");
			int ans = sc.nextInt();
			if (ans == a + b) {
				System.out.println("맞았습니다.");
				countC++;
			} else {
				System.out.println("틀렸습니다.");
				countM++;
			}
			
			if (countM == 3)
				break;

		}
		System.out.println("맞은 개수 : "+countC+"  틀린 개수 : "+countM);
		sc.close();
	}

}
