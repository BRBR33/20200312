//5�� ���� ��� ����� �ٲ㼭 ��

package com.human.ex;
import java.util.Scanner;
public class quiz04 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		while(i<6) {
			System.out.print(i+"��° ������ �Է��ϼ���:");
			int b = sc.nextInt();
			sum = sum + Math.abs(b);
			i++;
		}
		System.out.println("�ټ��� ������ ��:"+sum);
		
		sc.close();
	}

}
