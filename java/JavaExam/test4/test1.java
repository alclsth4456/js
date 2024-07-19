package test4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) throws InputMismatchException {

		int answer = (int) (Math.random()*10)+1;
		int input = 0;
		int cnt = 0;
		
		do {
			cnt++;
			System.out.println("=======================");
			System.out.println("answer의 값을 맞춰보세요");
			System.out.println("1~10 사이의 값을 입력: ");
		

			
		try {
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			
			if(input < 0) {
				throw new Exception("음수는 입력할 수 없습니다.");
			}
			}catch(InputMismatchException e) {
				System.out.println("숫자가 아닙니다. ");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요");
			}else if(answer < input) {
				System.out.println("더 작은 수를 입력하세요");
			}else {
				System.out.println("answer: " + answer);
				System.out.println("정답입니다.");
				System.out.println("시도 횟수: " + cnt+ "회");
			}
		}while(true);
	
		
	}

}
