//����׷��� �� ���?

package com.human.ex;

import java.util.Scanner;

public class quiz24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "";
		while (!str.equals("0")) {
			System.out.print("�����͸� �Է��Ͻÿ� : ");
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
