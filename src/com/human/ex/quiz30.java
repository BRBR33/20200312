//������� �������

package com.human.ex;

public class quiz30 {

	public static void main(String[] args) {

		System.out.println("������� ���� ��� ���α׷��Դϴ�.");

		int linenumber;
		int maxline = 5;
		int data;
		
		for(linenumber=1;linenumber<=maxline;linenumber++) {
			if (linenumber%2==0) {
				for(data=linenumber*5;data>=(linenumber*5)-4;data--) {
					System.out.print(data+"\t");
				}
				System.out.print("\n");
			}else {
				for(data=(linenumber-1)*5+1;data<=(linenumber)*5;data++) {
					System.out.print(data+"\t");
				}
				System.out.print("\n");
			}
		}
	}

}
