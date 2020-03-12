//1부터 입력값까지 덧셈

package com.human.ex;

import java.util.Scanner;

public class quiz11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 덧셈하는 프로그램입니다.\n마지막 값을 입력하세요.\n1부터 => ");
		int a = sc.nextInt();
		System.out.println("1부터 "+a+"까지 덧셈합니다.");
		int sum = 0;
		
		for(int i=1;i<=a;i++) {
			sum = sum + i;
			String ans = String.format("[%d]행 TotalNumber의 값 : %d", i-1, sum);
			System.out.println(ans);
		}
		System.out.println("\n1부터 "+a+"까지의 총합은 "+sum+"입니다.");
		sc.close();
	}

}
