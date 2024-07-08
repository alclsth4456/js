package test;

import java.util.Arrays;
import java.util.Collection;

public class test2 {

	public static void main(String[] args) {

		int arr[] = {17,92,18,33,58,7,26,42};
		
		int maxNum = arr[0];
		for(int i = 0; i <8; i++) {
			if(maxNum < arr[i]) {
//				Arrays.sort(arr,Collection.reverseOrder());
				maxNum= arr[i];
			}
		}
		System.out.println("배열 arr에서 가장 큰수:" + maxNum);
	}

}
