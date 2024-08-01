package test5;

public class test5 {

	public static void main(String[] args) {

		boolean sign = false;
		double pi = 0;
		 for (int i = 1; i <= 10000000; i += 2) {
	            if (sign) {
	                pi += 1.0 / i; // sign이 true일 때 더함
	            } else {
	                pi -= 1.0 / i; // sign이 false일 때 뺌
	            }
	            sign = !sign; // sign 값을 반전시킴
	            System.out.printf("i = %d, PI = %f\n", i, 4 * pi);
	}
	}
}
