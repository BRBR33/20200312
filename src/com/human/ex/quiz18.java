//5�� ��� 7�� ���

package com.human.ex;

import java.util.Scanner;

public class quiz18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է�: ");
		int a = sc.nextInt();
		System.out.print("�� ��° ���� �Է�: ");
		int b = sc.nextInt();
		int i;
		System.out.println(a+"�� ��� "+b+"�� ���");
		for(i=1;;i++) {
			if(i>a*b) break;
		
			if(i%a==0) {
				
				System.out.println(i);
			}	
			
		}
		
		sc.close();
	}

}
