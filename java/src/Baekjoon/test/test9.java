package test;

public class test9 {

	public static void main(String[] args) {

		System.out.println("1과 5의 최대공약수; " + gcd(5,1));
		System.out.println("1과 5의 최대공약수; " + gcd(6,3));
		System.out.println("1과 5의 최대공약수; " + gcd(18,12));
		System.out.println("1과 5의 최대공약수; " + gcd(60,24));
		System.out.println("1과 5의 최대공약수; " + gcd(192,162));
	}
	
	public static int gcd(int a, int b) {
		if(a % b ==0) {
			return b;
		}else {
			return gcd(b,a%b);
		}
	}

}
