//1���� �Է°����� ����

package com.human.ex;

import java.util.Scanner;

public class quiz11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1���� �����ϴ� ���α׷��Դϴ�.\n������ ���� �Է��ϼ���.\n1���� => ");
		int a = sc.nextInt();
		System.out.println("1���� "+a+"���� �����մϴ�.");
		int sum = 0;
		
		for(int i=1;i<=a;i++) {
			sum = sum + i;
			String ans = String.format("[%d]�� TotalNumber�� �� : %d", i-1, sum);
			System.out.println(ans);
		}
		System.out.println("\n1���� "+a+"������ ������ "+sum+"�Դϴ�.");
		sc.close();
	}

}
