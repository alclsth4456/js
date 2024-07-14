package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test4 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		//10807
//		int cnt= 0;
//		int n  = sc.nextInt();
//		int arr [] = new int [n]; 
		
//		for(int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//			int a = sc.nextInt();
//			
//			for(int j = 0; j <arr.length; j++) {
//				if(arr[j]==a) {
//					cnt++;
//				}
//			}
//			System.out.println(cnt);	
				
//		int n = Integer.parseInt(br.readLine());
//		int cnt = 0;
//		int arr [] = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//		}
//		int a = Integer.parseInt(br.readLine());
//		
//		for(int i = 0;i < arr.length; i++) {
//			if(arr[i]==a ) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		

		//10871
//		int n = sc.nextInt();
//		int x = sc.nextInt();
//		int arr [] = new int [n]; 
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//				
//		}
//		for(int i = 0; i < arr.length; i++) {
//			
//			if(arr[i] < x) {
//				System.out.println(arr[i] + " ");
//		}
//		}
//		
//		int n = Integer.parseInt(br.readLine());
//		int x = Integer.parseInt(br.readLine());
//		
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < n; i++) {
//			int a = Integer.parseInt(st.nextToken());
//			
//			if(a < x) {
//				sb.append(a).append(" ");
//			
//		}
//		System.out.println(sb);
		
		//10818
		
//		int n = Integer.parseInt(br.readLine());
//		int arr [] = new int [n]; 
//		int max = arr[0];
//		int min = arr[0];
		
//		for(int i = 0;i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		Arrays.sort(arr);
//		System.out.println(arr[0] + arr[n-1]);
		
		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i]= Integer.parseInt(st.nextToken());
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(max< arr[i]) {
//				max = arr[i];
//				}
//			if(arr[i] < min) {
//				min = arr[i];
//			}
//			System.out.println(max+ min);
//		}
//		
		
		//2562
//		int arr [] = new int [9];
//		int tmp = arr[0];
//		int cnt = 0;
//		
//		for(int i= 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			if(arr[i] > tmp) {
//				tmp=arr[i];
//				cnt= i+1;
//			}
//				
//			
//		}
//		System.out.println(tmp);
//		System.out.println(cnt);
		
		//10810
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int arr [] = new int[n+1];
//		
//		for(int i = 1;i <= m; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int c = sc.nextInt();
//		
//			for(int j = a; j <= b; j++) {
//			arr[j]=c;
//		}
//			
//		}
//		for(int i = 1; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
		//10813
//		int n2 = sc.nextInt();
//		int m2 = sc.nextInt();
//		int arr2 [] = new int[m2+1];
//		
//		int tmp = 0;
//		for(int i = 0; i < arr2.length; i++) {
//			int a2 = sc.nextInt();
//			int b2 = sc.nextInt();
//			
//		}
//		
		//5597
//		int arr [] = new int [31];
//		for(int i = 0; i < 29; i++) {
//			int n = sc.nextInt();
//			arr[i]=1;
//		}
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i]!=1) {
//			
//				System.out.println(i);
//		}
//		}
		
		//3052
//		int arr [] = new int [5];
//		int tmp = arr[0];
//		int cnt = 0;
//		for(int i = 0; i < 5; i++) {
//			arr[i] = sc.nextInt();
//			
//			if(arr[i]%42!=tmp) {
//				cnt++;
//				System.out.println(i);
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			
//		}
//		System.out.println("개수"+cnt);
		
		//서로 다른 나머지의 개수를 구하는 거니까 HashSet(중복허용 불가)으로 가능
//		HashSet<Integer> hs = new HashSet<>();
//		
//		for(int i = 0; i < 10; i++) {
//			hs.add(Integer.parseInt(br.readLine())%42);
//		}
		
		
		//10811
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int tmp;
//		int arr [] = new int [n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = i + 1;
//		}
//		
//		for(int i = 0; i < m; i++) {
//			int a = sc.nextInt()-1;
//			int b = sc.nextInt()-1;
//		
//			while(a < b) {
//				tmp = arr[a];
//				arr[a++] = arr[b];
//				arr[b--] = tmp;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		//1546
//		int m = sc.nextInt();//최댓값
		int n = sc.nextInt();  //과목 갯수
		int arr [] = new int [n];
		int all = arr[0];
		int max = 0;
		int result = 0;
		int avg;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i]> max) {
				max = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (arr[i]/max*100);
			result += arr[i];
		}
		avg = result/n;
		System.out.println(avg);
	}
}
