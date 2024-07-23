package sub3;

import java.util.Scanner;

public class AccountUser {

	 
	private static User user = new User();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("---------------------------------");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		int choice = sc.nextInt();
		sc.nextLine();
			switch(choice) {
			case 1: user.create(); break;
			case 2: user.show(); break;
			case 3: user.deposit(); break;
			case 4: user.withdraw(); break;
			case 5: return;
			default : 
				System.out.println("잘못 입력하였습니다.");
				break;
			}
			
		}
		
	}

}
