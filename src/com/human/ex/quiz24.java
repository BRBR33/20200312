//막대그래프 별 출력?

package com.human.ex;

import java.util.Scanner;

public class quiz24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "";
		while (!str.equals("0")) {
			System.out.print("데이터를 입력하시오 : ");
			str = sc.next();
			int a = Integer.parseInt(str);
			for (int i = 1; i <= a; i++) {
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
