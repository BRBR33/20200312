//�Է��� ���� ������ ���� ���

package com.human.ex;

import java.util.Scanner;

public class quiz19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("����� �������� �Է��ϼ���: ");
		int a = sc.nextInt();
		for(int i=9;i>0;i--) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
		
		sc.close();
	}

}
