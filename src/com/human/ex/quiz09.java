//1~10 중에 짝수 출력

package com.human.ex;

public class quiz09 {

	public static void main(String[] args) {

		System.out.println("1~10 가운데 짝수를 출력합니다.");
		for(int i=1;i<11;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
