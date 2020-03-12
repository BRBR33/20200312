//5의 배수 7번 출력

package com.human.ex;

import java.util.Scanner;

public class quiz18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력: ");
		int a = sc.nextInt();
		System.out.print("두 번째 수를 입력: ");
		int b = sc.nextInt();
		int i;
		System.out.println(a+"의 배수 "+b+"번 출력");
		for(i=1;;i++) {
			if(i>a*b) break;
		
			if(i%a==0) {
				
				System.out.println(i);
			}	
			
		}
		
		sc.close();
	}

}
