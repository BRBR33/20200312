//�Է��� �� �� ����(�� �� ����)�� ��� �������� ��

package com.human.ex;

import java.util.Scanner;

public class quiz15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է��ϼ���: ");
		int a = sc.nextInt();
		System.out.print("�� ��° ���� �Է��ϼ���: ");
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
		System.out.println("�� �� ������ ����:"+sum);

		sc.close();
	}

}
