//�������� ���߱�

package com.human.ex;

import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		java.util.Random ran = new java.util.Random();
		int a = ran.nextInt(10);

		System.out.println("0���� 9������ ���ڸ� �Է��ϼ���.");
		for(int i=1;;i++) {
			System.out.print(String.format("[%d��° ����] : ",i));
			int b = sc.nextInt();
			if(a>b) {
				System.out.println(b+"���ٴ� Ů�ϴ�.");
			}else if(a<b) {
				System.out.println(b+"���ٴ� �۽��ϴ�.");
			}else if(a==b) {
				System.out.println("���! ��Ȯ�մϴ�. "+i+"��°���� ���豺��!");
				break;
			}

			
		}
		sc.close();
	}

}
