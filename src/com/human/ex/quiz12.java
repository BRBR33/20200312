//카운트다운 발사

package com.human.ex;

public class quiz12 {

	public static void main(String[] args) {

	
		for(int i=60;i>=0;i--) {
			System.out.println(i);
			if(i==0) {
				System.out.println("발사");
				break;
			}
		}
	}

}
