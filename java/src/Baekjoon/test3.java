package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test3 {

	public static void main(String[] args) throws IOException{

	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	StringBuilder sb = new StringBuilder();
	BufferWriter bw = new BufferWriter(System.in);
	
	//2739
//	int n = sc.nextInt();
//	for(int i =1; i<=9; i++) {
//		System.out.println(n+ "x" + i+"="+(n*i));
//	}

	
	//10950
//	int t = sc.nextInt();
//	for(int i = 0; i< t; i++) {
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(a + b);
//	}
	
	//8393
//	int n = sc.nextInt();
//	int sum= 0;
//	for(int i = 1; i <= n; i++) {
//		sum += i; 
//	}
//	System.out.println(sum);
	
	//25304
//	int x = sc.nextInt();
//	int n = sc.nextInt();
//	
//	int sum = 0;
//	for(int i = 0; i < n; i++) {
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		sum += a * b;
//	}if(x==sum) {
//		System.out.println("yse");
//	}else System.out.println("no");
	
//	int x = Integer.parseInt(br.readLine());
//	int y = Integer.parseInt(br.readLine());
//	int sum = 0;
//	for(int i = 0; i < y; i++) {
//		int a = Integer.parseInt(br.readLine());
//		int b = Integer.parseInt(br.readLine());
//		
//		sum += a * b;
//	}if(x==sum) {
//		System.out.println("yes");
//	}else System.out.println("no");

	
	//25314
//	String str = "long";
//	int n = sc.nextInt();
//	int nByte = (n/4);
//	for(int i = 0; i < nByte; i++) {
//		
//		System.out.println(str+" int");
//	}
	
<<<<<<<< HEAD:java/src/Baekjoon/test3.java
//	int n = Integer.parseInt(br.readLine());
//	int bByte = n/4;
//	sb.append("long");
//	
//	for(int i= 0; i < bByte; i++) {
//		System.out.println(sb);
//	}
	
	//15552
	int t = Integer.parseInt(st.nextToken());
	for(int i = 0; i < t; i++) {
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		
		bw.write(a+b);
		bw.flush();
		
========
	for(int i= 0; i < n; i++) {
		System.out.println(sb);
>>>>>>>> 8db44b29844a485bbf986edd0608178b8bc56eb7:java/src/Baekjoon/.metadata/.plugins/org.eclipse.core.resources/.history/10/b0953e2ba13b001f1138bdfce235db7b
	}
	}

}
