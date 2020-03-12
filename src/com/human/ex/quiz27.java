//0입력시 종료되는 max,min 판별기

package com.human.ex;

import java.util.Scanner;

public class quiz27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int a;
		do {
			System.out.print("하나의 숫자를 입력하세요(0 입력 종료) : ");
			a = sc.nextInt();
			if(a>max) {
				max = a;
			}else if(a<min) {
				min = a;
			}
		}while(a!=0);
		System.out.println("가장 큰 수 : "+max);
		System.out.println("가장 작은 수 : "+min);
		
		sc.close();
	}

}
