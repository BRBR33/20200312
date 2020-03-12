//동전던지기

package com.human.ex;
import java.util.Random;
public class quiz32 {

	public static void main(String[] args) {
		
		Random rn = new Random();
		System.out.println("동전 던지기 게임을 시작합니다.");
		int a = rn.nextInt(2);
		if(a==0) {
			System.out.println("앞면입니다.");
		}else {
			System.out.println("뒷면입니다.");
		}
		
		
	}

}
