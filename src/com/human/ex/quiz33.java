//주사위 숫자 맞추기

package com.human.ex;

import java.util.Random;
import java.util.Scanner;

public class quiz33 {

	public static void main(String[] args) {

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int a = rn.nextInt(6)+1;
		int count = 0;
		System.out.println("1~6까지 숫자를 입력하세요!");
		int input = sc.nextInt();
		while (true) {
			count++;
			if (input == a) {
				String str = String.format("주사위 숫자를 맞췄습니다! ** 주사위 : %d User : %d **\n반복횟수는 %d회 입니다!", a, input, count);
				System.out.println(str);
				break;
			} else if (input < 1 || input > 6) {
				System.out.println("##1~6까지의 숫자를 입력해주세요! 횟수는 늘어나지 않습니다.##");
				count--;
			}else {
				System.out.println("실패! 다시 시작하겠습니다.");
			}
			

			System.out.println("1~6까지 숫자를 입력하세요!");
			input = sc.nextInt();
		}
		
		sc.close();
	}

}
