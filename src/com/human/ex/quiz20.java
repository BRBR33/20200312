//�Է��� ���� ��� ���

package com.human.ex;

import java.util.Scanner;

public class quiz20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			
			if(a%i==0) {
			System.out.println(i);
			}
		}
		
		sc.close();
	}

}
