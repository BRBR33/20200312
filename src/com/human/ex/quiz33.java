//�ֻ��� ���� ���߱�

package com.human.ex;

import java.util.Random;
import java.util.Scanner;

public class quiz33 {

	public static void main(String[] args) {

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int a = rn.nextInt(6)+1;
		int count = 0;
		System.out.println("1~6���� ���ڸ� �Է��ϼ���!");
		int input = sc.nextInt();
		while (true) {
			count++;
			if (input == a) {
				String str = String.format("�ֻ��� ���ڸ� ������ϴ�! ** �ֻ��� : %d User : %d **\n�ݺ�Ƚ���� %dȸ �Դϴ�!", a, input, count);
				System.out.println(str);
				break;
			} else if (input < 1 || input > 6) {
				System.out.println("##1~6������ ���ڸ� �Է����ּ���! Ƚ���� �þ�� �ʽ��ϴ�.##");
				count--;
			}else {
				System.out.println("����! �ٽ� �����ϰڽ��ϴ�.");
			}
			

			System.out.println("1~6���� ���ڸ� �Է��ϼ���!");
			input = sc.nextInt();
		}
		
		sc.close();
	}

}
