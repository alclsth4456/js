package Collection;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {

	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50,60,70,40,30,20};
		
		Set<Integer> set = new HashSet<Integer>();
		
		System.out.println("데이터" + "\t" + "set삽입");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + "\t" + (set.add(arr[i])?"true":"중복데이터"));
		}
	}

}
