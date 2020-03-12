//유사계산기

package com.human.ex;

import java.util.Scanner;

public class quiz06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = "";
		int x1=0, x2=0;
		String op = "";
		do {
			System.out.println("**********\n1.숫자입력\n2.연산선택\n3.종료\n**********\n");
			System.out.print("입력:");
			a = sc.next();
			System.out.print("\n\n");
			switch (a) {
			case "1":
				System.out.print("첫 번째 수를 입력하세요:");
				x1 = sc.nextInt();
				System.out.print("두 번째 수를 입력하세요:");
				x2 = sc.nextInt();
				break;
			case "2":
				System.out.print("연산선택(+,-,*,/):");
				op = sc.next();
				switch (op) {
				case "+":
					String ans = String.format("%s연산 %d%s%d=%.1f",op,x1,op,x2,((double) x1+x2));
					System.out.println(ans);
					System.out.println("확인 후 아무 키나 눌러주세요.");
					break;
				case "-":
					ans = String.format("%s연산 %d%s%d=%.1f",op,x1,op,x2,((double) x1-x2));
					System.out.println(ans);
					System.out.println("확인 후 아무 키나 눌러주세요.");
					break;
				case "*":
					ans = String.format("%s연산 %d%s%d=%.1f",op,x1,op,x2,((double) x1*x2));
					System.out.println(ans);
					System.out.println("확인 후 아무 키나 눌러주세요.");
					break;
				case "/":
					ans = String.format("%s연산 %d%s%d=%.1f",op,x1,op,x2,((double) x1/x2));
					System.out.println(ans);
					System.out.println("확인 후 아무 키나 눌러주세요.");
					break;
				default:
					System.out.println("연산기호만 입력하세요.");
					break;
				}
				break;
			case "3":
				System.out.println("종료되었습니다. 감사합니다.");
				break;
			default:
				System.out.println("1~3중에서만 입력하세요.");
				break;

			}

		} while (!a.equals("3"));

		sc.close();
	}

}
