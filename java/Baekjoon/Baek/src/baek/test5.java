package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class teast5 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
//		StringTokenizer st = new StringTokenizer(br.nextToken());
		
//		String str = sc.nextLine();
//		int n = sc.nextInt();
//		char ch = str.charAt(n-1);
//		System.out.println(ch);
		
		//2743
//		String str = sc.nextLine();
//		char[] ch = str.toCharArray();
//		int n = ch.length;
//		System.out.println(n);
		
		//9086
//		int n = sc.nextInt();
//		String arr [] = new String [n];
//		
//		for(int i = 0; i < n; i++) {
//			String str = sc.next();
//			System.out.println(str.charAt(0));
//			System.out.println(str.charAt(str.length()-1));
//		}
		
		//11654
//		String str = sc.next();
//		int n = (int)str.charAt(0);
//		System.out.println(n);

//		int num = sc.next().charAt(0);
//		System.out.println(num);
		
		//11720
//		int n = sc.nextInt();
//		int sum = 0;
//		String str = sc.next();
//		for(int i = 0; i < n; i++) {
//			
//			sum += str.charAt(i)-'0';
//		}
//		System.out.println(sum);
		
		//10809
//		String  str = sc.next();
//		int arr [] = new int [26];
//		
//		
//		for(int i = 0; i < 26; i++) {
//			arr[i] = -1;
//		}
//		
//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//		
//			if(arr[ch-'a'] == -1) {
//				arr[ch-'a'] = i;
//		}
//		}
//		
//		for(int a : arr) {
//			System.out.println(a);
//		}
//		
		
		//2675
//		System.out.println("테스트 갯수");
//		int t = sc.nextInt();//테스트 갯수
//		String arr [] = new String [t];
//		
//		for(int i = 0; i < t; i++) {			
//			System.out.println("문자열 반복할 갯수");
//			int r = sc.nextInt();  //문자열 반복할 갯수
//			System.out.println("스트링 입력");
//			String s = sc.next();  //스트링 입력
//	
//			for(int j = 0; j < s.length(); j ++) {
//				for(int k = 0; k < r; k++) {
//					System.out.print(s.charAt(j));
//					
//				}
//			}
//			System.out.println();
//			
//		}
		
		//1152 
//		String str = sc.nextLine();
//		StringTokenizer st = new StringTokenizer(str," ");
//		System.out.println(st.countTokens());
//	
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		System.out.println(st.countTokens());
		
		//2908
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		num1 = Integer.parseInt(new StringBuilder().append(num1).reverse().toString());
//		num2 = Integer.parseInt(new StringBuilder().append(num2).reverse().toString());
//		
//		System.out.print(num1 > num2 ? num1:num2);
		
		//5622
//		String str = sc.nextLine();
//		int num = str.length();
//		int cnt = 0;
////		char ch = str.charAt(0);
//		for(int i = 0; i < num; i++) {
//			switch(str.charAt(i)) {
//			case 'A': case 'B': case'C':
//			cnt +=3;
//			break;
//			
//			case 'D' : case 'E': case 'F':
//				cnt += 4;
//				break;
//				
//			case 'G': case 'H': case 'I':
//				cnt+=5;
//				break;
//			
//			case 'J': case 'K': case 'L':
//				cnt+=6;
//				break;
//			
//			case 'M': case 'N': case 'O':
//				cnt+=7;
//				break;
//			
//			case 'P': case 'Q': case 'R': case 'S':
//				cnt+=8;
//				break;
//			
//			case 'T': case 'U': case 'V':
//				cnt+=9;
//				break;
//			
//			case 'W': case 'X': case 'Y': case 'Z':
//				cnt+=10;
//				break;
//				
//			}	
//		}
//		System.out.println(cnt);
		
		//11718
		//nextLine: 엔터치기 전까지 입력값을 받음
		//hasNextLine: 형태가 boolean으로 참, 거짓을 판단 입력이 있는지 여부를 판단하여
		//입력값이 있으면 true, 없으면 false를 반환
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				System.out.println(str);
			}
			sc.close();

		}
	
	

}
