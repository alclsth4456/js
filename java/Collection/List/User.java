package sub3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class User implements AccountIn{
	
	public List<Account> userList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	@Override
	public void create() {
		Account user = new Account();
		System.out.println("이름");
		user.setName(sc.nextLine());
		System.out.println("계좌번호");
		user.setAcc(sc.nextLine());
		System.out.println("입금할 금액");
		user.setMoney(sc.nextInt());
		sc.nextLine();
		userList.add(user);
		
	}

	@Override
	public void show() {

		
		System.out.println("예금주명");
		String name = sc.nextLine();
		System.out.println("계좌번호");
		String account = sc.nextLine();
			for(Account data : userList) {
				if(data.getName().equals(name)&&data.getAcc().equals(account)) {
				System.out.println(data);
			}
				else System.out.println("해당 예금주는 존재하지 않습니다.");
		}
		
	}

	@Override
	public void deposit() {
		
		System.out.println("예금주명");
		String name = sc.nextLine();
		System.out.println("계좌번호");
		String account = sc.nextLine();
		for(Account data: userList) {
			if(data.getName().equals(name)&&data.getAcc().equals(account)) {
				System.out.println("입금하실 금액");
				int money = sc.nextInt();
				 sc.nextLine();
//				data.setName(name);
				data.setMoney(data.getMoney()+money);
				System.out.println(data);
//				userList.add(data);
			}
			else
			System.out.println("현재 고객님이 존재하지 않습니다.");
		}
	
	}

	@Override
	public void withdraw() {
		
		System.out.println("예금주명");
		String name = sc.nextLine();
		for(Account data: userList) {
			if(data.getName().equals(name)) {
				System.out.println("출금하실 금액");
				int money = sc.nextInt();
				sc.nextLine();
				if(data.getMoney()<money) {
					System.out.println("잔액이 부족합니다.");
				}else {
					data.setMoney(data.getMoney()-money);
					System.out.println(data);
					
				}
//				data.setName(name);
//				userList.add(data);
			}
			else
			System.out.println("현재 고객님이 존재하지 않습니다.");
		}
		
	}

}
