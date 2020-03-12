//입력한 수의 약수 출력

package com.human.ex;

import java.util.Scanner;

public class quiz20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			
			if(a%i==0) {
			System.out.println(i);
			}
		}
		
		sc.close();
	}

}
