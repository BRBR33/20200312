//93���� �Ǻ���ġ ���� ���

package com.human.ex;

import java.util.Arrays;

public class quiz29 {

	public static void main(String[] args) {

		long arr[] = new long[93];

		for (int i = 2; i < 93; i++) {
			arr[0] = 0;
			arr[1] = 1;
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println(Arrays.toString(arr));

	}

}
