//��������Ǻ�, ���� ���ϱ�

package com.human.ex;

import java.util.Scanner;

public class quiz22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ ������ ���ϴ� ���α׷� �Դϴ�.");
		System.out.println("0�� �Է��ϸ� ���α׷��� �����մϴ�.");
		
		System.out.print("[�Է�] => ");
		int a = sc.nextInt();
		while(a!=0) {
			if(a>0) {
				System.out.println("�������. ������ "+a+"�Դϴ�.");
			}else {
				System.out.println("��������. ������ "+(-a)+"�Դϴ�.");
			}
			System.out.print("[�Է�] => ");
			a = sc.nextInt();
		}
		
		
		sc.close();
	}

}
