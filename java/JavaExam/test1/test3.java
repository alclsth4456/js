package test1;

public class test3 {

	public static void main(String[] args) {

		int result = 0;
		int num = 1;
		
		result = num++; // 대입 연산 후 증가		
		System.out.println("result : "+result);
		
		result = ++num;	// 증가 연산 후 대입		
		System.out.println("result : "+result);
		
		result = num--;		
		System.out.println("result : "+result);
		
		result = --num;		
		System.out.println("result : "+result);	
	}

}
