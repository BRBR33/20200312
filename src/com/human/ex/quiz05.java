//입력한 값에서 2씩 감소하는 a, 3씩 증가하는 b

package com.human.ex;
import java.util.Scanner;
public class quiz05 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하세요:");
		int input = sc.nextInt();
		int a = 0, b = 0;
		for(int i=1;;i++) {
			a = input - 2*i;
			b = 3*i;
			if(a-b<0) {
				
				System.out.println("a의 값은:"+a+", b의 값은:"+b);
				System.out.println("a-b<0 때까지의 횟수는:"+i);
				break;
			}
		}
		
		sc.close();
	}

}
