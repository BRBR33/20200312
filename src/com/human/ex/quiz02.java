//1부터 더한 값이 입력한 수보다 커지면 종료하는 반복문

package com.human.ex;
import java.util.Scanner;
public class quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int a = sc.nextInt();
		int sum = 0;
		for(int i=1;;i++) {
			sum = sum+i;
			
			if(sum>a) {
				System.out.println("1부터 "+i+"까지의 합은 "+sum+"입니다.");
				break;
			}
		}
		sc.close();
	}

}
