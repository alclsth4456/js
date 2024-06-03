package Baekjoon;
import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;
	import java.util.StringTokenizer;
	
public class 배열 {

	
	

		public static void main(String[] args) throws IOException   {
			Scanner sc = new Scanner(System.in);
			//길이 10인 배열을 선언하고 1~10까지
			//반복문을 이용하여 값을 출력
			
		
			
//			for(int i = 0; i<arr.length; i++) {
//				arr[i] = i+1;
			
//			}
		
		

			

		//11718
		//입력받은대로 알파벳 대소문자, 공백,숫자
		/*
			
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				System.out.println(str);
			}
		

			}
			
			Scanner sc = new Scanner(System.in);
		int king = 1;
		int queen = 1;
		int luk = 2;
		int bishop = 2;
		int night = 2;
		int pon = 8;
		
		king -=  sc.nextInt();
		queen -= sc.nextInt();
		luk-= sc.nextInt();
		bishop -= sc.nextInt();
		night -= sc.nextInt();
		pon -= sc.nextInt();
		System.out.println(king+ queen + luk + bishop + night + pon);

	//배수와 약수 구하기
			int a = sc.nextInt();
			int b = sc.nextInt();

			
			if(b%a==0) {
				System.out.println("factor");
			}
			else if(a%b==0) {
				System.out.println("multiple");
			
			}else {
				System.out.println("neither");
			}
	*/		
			
	//2501약수 구하기
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			StringTokenizer st = new StringTokenizer(br.readLine());
	/*
			int cnt=0;
			int a =sc.nextInt();
			int b = sc.nextInt();
			int arr[] = new int [a];
			for(int i=1;i<a; i++) {
				
				if(a%i==0) {
					cnt++;
					System.out.println(cnt);
				}
				if(cnt==b) {
					int result =cnt;
					System.out.println(result);
				break;
				}
			}

	//9506
	//약수들의 합
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder str = new StringBuilder();
			int sum = 0;
			int n = Integer.parseInt(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 1; i< n-1; i++) {
				if(n%i==0) {
					
					arr.add(i);
					sum+=i;
				}else if(n==sum) {
					str.append("=");
				}else {
					System.out.println("n is not perfect");
				}
				if(n==i) {
					System.out.println("-1");
				}
			}
	*/
			
	//1978
	//소수 찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		/*
		int cnt=0;
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 0; i <n; i++) {
				int s = Integer.parseInt(br.readLine());
				if(s==1) {
					continue;
				}
				for(int j= 2; j <s; j++) {
				if(s%j==0) {
					continue;
				}else {
					cnt++;
				}
				
			}
			}	
			System.out.println(cnt);
			

		
		int cnt=0;
		while(st.hasMoreTokens()) {
			boolean isNum=true;
			
			int num = Integer.parseInt(st.nextToken());
			if(num==1) {
				continue;
			}
			for(int j= 2; j <Math.sqrt(num); j++) {
				if(num%j==0) {
					isNum=false;
					break;
				}
				if(isNum) {
					cnt++;
					
				}
				System.out.println(cnt);
		}
	*/
	//2581
	//M이상 N이하의 수중 소수인 것을 찾아 합을 첫줄에
	//최솟값을 둘째줄에 출력 없을 경우 첫째줄에 -1 출력
	/*	
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		
			
				
	//1085
		
	int a1 = Integer.parseInt(br.readLine());
	int b1=Integer.parseInt(br.readLine());

	int a2 = sc.nextInt();
	int b2 = sc.nextInt();

	int sum1= a2-a1;
	int sum2=b2-b1;

	if(sum1>sum2) {
		System.out.println(sum2);
	}else {
		System.out.println(sum1);
	}
	/*
			sum1= Math.min(a1, a2-a1);
			sum2= Math.min(b1, b2-b1);
			System.out.println(Math.min(sum1, sum2));


	//3009
	int x1[] = {sc.nextInt(),sc.nextInt()};
	int x2[] = {sc.nextInt(),sc.nextInt()};
	int x3[] = {sc.nextInt(),sc.nextInt()};


	//int	[] s1= {Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine())};
	//int	[] s2= {Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine())};
	//int	[] s3= {Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine())};
	int x,y= 0;
	if(x1[0]==x2[0]) {
		 x = x3[0];
		
	}else if(x2[0]==x3[0]) {
		x=x1[0];
	}else
		x=x2[0];
		
	if(x1[1]==x2[1]) {
		x=x3[1];
	}
	else if(x2[1]==x3[1]) {
		x=x1[1];
	}else
		x=x2[2];
			
	//15894
	int n= sc.nextInt();

	//int sum=n*3+((n*1)-1);//9
	int s=0;
	//if( ) {
		
		System.out.println(n*3+n);
	//}
	*/	
	//10101

			
			
	//sc.close()	;
}
}