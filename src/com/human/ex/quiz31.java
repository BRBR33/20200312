//달력

package com.human.ex;

public class quiz31 {

	public static void main(String[] args) {

		int startDay = 3;
		int day, date;
		int dayOfMonth = 31;

		System.out.println("======================");
		System.out.println("   일    월    화    수    목    금   토 ");
		System.out.println("======================");

		for (day = 0; day < startDay; day++) {
			System.out.print("   ");
		}
		for (date = 1; date <= dayOfMonth; date++) {
			if (day == 7) {
				day = 0;
				System.out.print("\n");
			}
			day++;
			System.out.print(String.format("%3d", date));

		}
		System.out.print("\n");
		System.out.println("======================");
	}

}
