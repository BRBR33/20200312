//while문을 for문으로 바꾸기

package com.human.ex;

public class quiz08 {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		
		for(i=1;i<100;i++) {
			sum += i;
		}
		
		System.out.println("합은 : "+sum);
	
	}

}
