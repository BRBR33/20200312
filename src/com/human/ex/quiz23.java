//ȭ���µ� �����µ�

package com.human.ex;

public class quiz23 {

	public static void main(String[] args) {

		System.out.println("=====================\nȭ���µ�\t\t�����µ�\n=====================\n");
		for (int i = 1; i <= 100; i++) {
			double b = ((double) 5/9)*(i-32);
			if (i % 10 == 0) {
				String ans = String.format("%d \t\t %.1f", i, b);
				System.out.println(ans);
			}
		}
	}

}
