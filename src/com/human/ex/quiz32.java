//����������

package com.human.ex;
import java.util.Random;
public class quiz32 {

	public static void main(String[] args) {
		
		Random rn = new Random();
		System.out.println("���� ������ ������ �����մϴ�.");
		int a = rn.nextInt(2);
		if(a==0) {
			System.out.println("�ո��Դϴ�.");
		}else {
			System.out.println("�޸��Դϴ�.");
		}
		
		
	}

}
