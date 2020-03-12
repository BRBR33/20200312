//소수인가 아닌가 판별

package com.human.ex;

import java.util.Scanner;

public class quiz16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 숫자를 입력하세요: ");
		int a = sc.nextInt();
		int i;
		for(i=2;i<a;i++) {
			if(a%i==0) break;
		}

		if(i==a) {
			System.out.println(a+"은(는) 소수입니다.");
		}else {
			System.out.println(a+"은(는) 소수가 아닙니다.");
		}
		sc.close();
	}

}
