//total 100 break, continue 바꾸는 while문

package com.human.ex;

public class quiz01 {

	public static void main(String[] args) {

		int total = 100;
		while (true) {
			if (total > 10) {
				break;
			}

			total = total - 3;
		}
		System.out.println("합계는 : " + total);

	}

}
