//���δٸ� �ݺ��� 3�� �ϴ� ��

package com.human.ex;
import java.util.Scanner;
public class quiz03 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
//for��		
		for(;;) {
			System.out.print("�Է��ϼ��� : ");
			String a = sc.next();
			if(a.equals("����")) break;
		}
		
//while ��
//		while(true) {
//			System.out.print("�Է��ϼ��� : ");
//			String a = sc.next();
//			if(a.equals("����")) break;
//		}
		
		
//do~while ��	
//		do {
//			System.out.print("�Է��ϼ��� : ");
//			String a = sc.next();
//			if(a.equals("����")) break;
//		}while(true);
			
		System.out.println("��~~");
		sc.close();
	}

}
