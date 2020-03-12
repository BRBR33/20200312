//5개 정수 모두 양수로 바꿔서 합

package com.human.ex;
import java.util.Scanner;
public class quiz04 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		while(i<6) {
			System.out.print(i+"번째 정수를 입력하세요:");
			int b = sc.nextInt();
			sum = sum + Math.abs(b);
			i++;
		}
		System.out.println("다섯개 정수의 합:"+sum);
		
		sc.close();
	}

}
