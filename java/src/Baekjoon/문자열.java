package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 문자열 {


		public static void main(String[] args) {

	//9086 
	//문자열 입력받아 문자열의 첫글자와 마지막 글자 출력
			Scanner sc = new Scanner(System.in);
	/*	
			int n = sc.nextInt();

			String num [] = new String [n];
			for(int i = 0; i<n; i++) {
				System.out.println("단어: ");
				String str = sc.next();
				num[i] = str.substring(0,1)+
				str.substring(str.length()-1,str.length());
//		System.out.println(num[i]);
			}
			for(int i = 0;i<n; i++) {
				System.out.println(num[i]);

			}
	 */
	//11654
	//알파벳 소문자, 대문자, 숫자 0~9중 하나가 주어졌을때
	//주어진 글자의 아스키 코드값을 출력
	/*
		char ch = sc.next().charAt(0);
		int num = (int)ch;
		System.out.println(num);

	//11720
	//N개의 숫자가 공백없이 쓰여있다. 이 숫자를 모두 합해 출력
			int N = sc.nextInt();
			
			int sum = 0;
			String S = sc.next();
			for(int i = 0; i<N; i++) {
				
				sum +=S.charAt(i)-'0';
				
//				System.out.println(S);
				
		
			}
			System.out.println(sum);
			
	//10809
	//알파벳 소문자로 이루어진 단어S 
	//단어에 포함되어있는 경우에는 처음 등장하는 위치를
	//포함되어있지 않는 경우 -1
			System.out.println("단어입력: ");
			int abc [] = new int [26] ;
			for(int i =0; i<abc.length; i++) { //알파벳 배열
				abc[i] = -1;
			}
			String str = sc.next(); //문자열 
			for(int i = 0; i<str.length(); i++) {
				char ch = str.charAt(i);
			
			if(abc[ch - 'a'] == -1) {
				abc[ch -'a'] =i;
			}
			}
			for(int val: abc) {
				System.out.println(val);
			}
			

	//2675
	//문자열S 입력받은후 문자를 R번 반복해서 새 문자열 P만든후 출력		
			String str;
			int r;
			int t = sc. nextInt();
			for(int k = 0; k<t; k++) {
				r = sc.nextInt();
				str = sc.next();
				
			
			for(int i = 0;i<str.length();i++) {
				for(int j = 0; j<r; j++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
			}
		
	//1152
	//영어 대소문자 단어의 개수를 출력
			//the curious case of benjamin button
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");
			
			System.out.println(st.countTokens());
			
	//알파벳안어를 거꾸로해도 똑같다면 1, 아니면 0
		//	StringBuffer sb = new StringBuffer(sc.nextLine());
			String str = sc.nextLine();
			int len = str.length();
			int ans = 1;
			
			StringBuilder sb = new StringBuilder(str);
		String reverse = sb.reverse().toString();
//		sb.reverse();
		System.out.println(reverse);
			if(sb.equals(reverse)) 
				System.out.println("1");
			 else 
				System.out.println("0");
	*/		
			
			
			sc.close();
		}
	}
}
