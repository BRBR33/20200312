//�������� �Է��ϱ� , 0�Է��ϸ� ����

package com.human.ex;

import java.util.Scanner;

public class quiz10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		int a = 0;
		int sum = 0;
		while (true) {
			a = sc.nextInt();
			sum = sum + a;
			if(a==0) break;
		}
		System.out.println("���� ������ �հ�� " + sum + "�Դϴ�.");
		sc.close();
	}

}
