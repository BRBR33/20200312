//1���� ���� ���� �Է��� ������ Ŀ���� �����ϴ� �ݺ���

package com.human.ex;
import java.util.Scanner;
public class quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		int sum = 0;
		for(int i=1;;i++) {
			sum = sum+i;
			
			if(sum>a) {
				System.out.println("1���� "+i+"������ ���� "+sum+"�Դϴ�.");
				break;
			}
		}
		sc.close();
	}

}
