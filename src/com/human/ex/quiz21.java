//1000���� �߿� �ϳ� �Է��ؼ� ����� ����,��

package com.human.ex;

import java.util.Scanner;

public class quiz21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1���� 1000������ �� �߿��� �ϳ��� �Է��ϼ���. ==> ");
		int a = sc.nextInt();
		int count = 0;
		int sum = 0;
		for(int i=1;i<=1000;i++) {
			
			if(i%a==0) {
				count++;
				sum = sum + count;
			}
		}

		System.out.println("1���� 1000���� "+a+"�� ����� ���� : "+count+", ����� �� : "+a*sum);
		
		sc.close();
	}

}
