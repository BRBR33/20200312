//0�Է½� ����Ǵ� max,min �Ǻ���

package com.human.ex;

import java.util.Scanner;

public class quiz27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int a;
		do {
			System.out.print("�ϳ��� ���ڸ� �Է��ϼ���(0 �Է� ����) : ");
			a = sc.nextInt();
			if(a>max) {
				max = a;
			}else if(a<min) {
				min = a;
			}
		}while(a!=0);
		System.out.println("���� ū �� : "+max);
		System.out.println("���� ���� �� : "+min);
		
		sc.close();
	}

}
