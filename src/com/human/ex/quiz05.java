//�Է��� ������ 2�� �����ϴ� a, 3�� �����ϴ� b

package com.human.ex;
import java.util.Scanner;
public class quiz05 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���:");
		int input = sc.nextInt();
		int a = 0, b = 0;
		for(int i=1;;i++) {
			a = input - 2*i;
			b = 3*i;
			if(a-b<0) {
				
				System.out.println("a�� ����:"+a+", b�� ����:"+b);
				System.out.println("a-b<0 �������� Ƚ����:"+i);
				break;
			}
		}
		
		sc.close();
	}

}
