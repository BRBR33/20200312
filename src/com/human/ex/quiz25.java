//���� ����

package com.human.ex;

import java.util.Scanner;

public class quiz25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a =1000;
		System.out.println("�ʱ⿬�ᷮ : "+a);
		while(a!=0) {
			System.out.print("���� ������ +��, �Ҹ�� -�� �Է����ּ��� : ");
			int b = sc.nextInt();
			a = a+b;
			System.out.println("���� ���� �ִ� ���� "+a+"�Դϴ�.");
			
			if(a!=0 && a<100) {
				System.out.println("(���) ���ᰡ 10%�̸��Դϴ�.");
			}
			
		}
		System.out.println("(���) ���ᰡ �����ϴ�.");
		
		sc.close();
	}

}
