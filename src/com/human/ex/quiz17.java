//1~100 3과 5의 공배수 출력

package com.human.ex;

public class quiz17 {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

}
