//�������

package com.human.ex;

import java.util.Scanner;

public class quiz06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = "";
		int x1=0, x2=0;
		String op = "";
		do {
			System.out.println("**********\n1.�����Է�\n2.���꼱��\n3.����\n**********\n");
			System.out.print("�Է�:");
			a = sc.next();
			System.out.print("\n\n");
			switch (a) {
			case "1":
				System.out.print("ù ��° ���� �Է��ϼ���:");
				x1 = sc.nextInt();
				System.out.print("�� ��° ���� �Է��ϼ���:");
				x2 = sc.nextInt();
				break;
			case "2":
				System.out.print("���꼱��(+,-,*,/):");
				op = sc.next();
				switch (op) {
				case "+":
					String ans = String.format("%s���� %d%s%d=%.1f",op,x1,op,x2,((double) x1+x2));
					System.out.println(ans);
					System.out.println("Ȯ�� �� �ƹ� Ű�� �����ּ���.");
					break;
				case "-":
					ans = String.format("%s���� %d%s%d=%.1f",op,x1,op,x2,((double) x1-x2));
					System.out.println(ans);
					System.out.println("Ȯ�� �� �ƹ� Ű�� �����ּ���.");
					break;
				case "*":
					ans = String.format("%s���� %d%s%d=%.1f",op,x1,op,x2,((double) x1*x2));
					System.out.println(ans);
					System.out.println("Ȯ�� �� �ƹ� Ű�� �����ּ���.");
					break;
				case "/":
					ans = String.format("%s���� %d%s%d=%.1f",op,x1,op,x2,((double) x1/x2));
					System.out.println(ans);
					System.out.println("Ȯ�� �� �ƹ� Ű�� �����ּ���.");
					break;
				default:
					System.out.println("�����ȣ�� �Է��ϼ���.");
					break;
				}
				break;
			case "3":
				System.out.println("����Ǿ����ϴ�. �����մϴ�.");
				break;
			default:
				System.out.println("1~3�߿����� �Է��ϼ���.");
				break;

			}

		} while (!a.equals("3"));

		sc.close();
	}

}
