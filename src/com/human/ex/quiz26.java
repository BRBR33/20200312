//1~1000까지 10마다 행바꿔서 출력

package com.human.ex;

public class quiz26 {

	public static void main(String[] args) {

		for(int i= 1;i<=1000;i++) {
			System.out.print(String.format("%d ",i));
			if(i%10==0) {
				System.out.print("\n");
			}
		}
	}

}
