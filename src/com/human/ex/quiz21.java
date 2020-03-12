//1000까지 중에 하나 입력해서 배수의 개수,합

package com.human.ex;

import java.util.Scanner;

public class quiz21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 1000까지의 수 중에서 하나는 입력하세요. ==> ");
		int a = sc.nextInt();
		int count = 0;
		int sum = 0;
		for(int i=1;i<=1000;i++) {
			
			if(i%a==0) {
				count++;
				sum = sum + count;
			}
		}

		System.out.println("1부터 1000까지 "+a+"의 배수의 개수 : "+count+", 배수의 합 : "+a*sum);
		
		sc.close();
	}

}
