//�Ҽ��ΰ� �ƴѰ� �Ǻ�

package com.human.ex;

import java.util.Scanner;

public class quiz16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�ϳ��� ���ڸ� �Է��ϼ���: ");
		int a = sc.nextInt();
		int i;
		for(i=2;i<a;i++) {
			if(a%i==0) break;
		}

		if(i==a) {
			System.out.println(a+"��(��) �Ҽ��Դϴ�.");
		}else {
			System.out.println(a+"��(��) �Ҽ��� �ƴմϴ�.");
		}
		sc.close();
	}

}
