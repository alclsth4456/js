package test;

public class test7 {

	public static void main(String[] args) {

		System.out.println("1과 5의 최대공약수: " + gcd(1, 5));
		System.out.println("1과 5의 최대공약수: " + gcd(3,6));
		System.out.println("1과 5의 최대공약수: " + gcd(12,18));
		System.out.println("1과 5의 최대공약수: " + gcd(60,24));
		System.out.println("1과 5의 최대공약수: " + gcd(192,162));
	}
	
	public static int gcd(int a, int b) {
		
		int tmp = 0;
		if(a < b) {
			tmp = a;
		}else {
			tmp = b;
		}
		
		while(true) {
			if(a % tmp ==0 && b % tmp ==0) {
				//tmp = (a < b) ? a:b;
				break;
			}
			tmp--; 
		}
		return tmp;
	}

}
