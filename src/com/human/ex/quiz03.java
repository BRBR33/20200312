//서로다른 반복문 3개 하는 것

package com.human.ex;
import java.util.Scanner;
public class quiz03 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
//for문		
		for(;;) {
			System.out.print("입력하세요 : ");
			String a = sc.next();
			if(a.equals("종료")) break;
		}
		
//while 문
//		while(true) {
//			System.out.print("입력하세요 : ");
//			String a = sc.next();
//			if(a.equals("종료")) break;
//		}
		
		
//do~while 문	
//		do {
//			System.out.print("입력하세요 : ");
//			String a = sc.next();
//			if(a.equals("종료")) break;
//		}while(true);
			
		System.out.println("끝~~");
		sc.close();
	}

}
