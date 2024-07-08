package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoStore {

	Scanner sc = new Scanner(System.in);
	
	public void Store_Menu() {
		System.out.println("Lotto 프로그램");
		System.out.println("==============================");
		System.out.println("1.Lotto구입" + "\n" + "2.프로그램 종료");
		System.out.println("==============================");
		
		while(true) {
			System.out.println("메뉴 선택");
			int choice = sc.nextInt();
			if(choice==1) {
				BuyLotto();
			}else if(choice==2) {
				System.out.println("프로그램 종료");
				return;
			}
			else {
				System.out.println("번호를 잘못입력하였습니다.");
			}
		}
		
	}
	
	public void BuyLotto() {
		System.out.println("금액입력");
		int money = sc.nextInt();
		
		if(money <1000) {
			System.out.println("1000원 이상 입력하시오");
		}else if(money>100000) {
			System.out.println("금액을 초과하였습니다.");
			return;
		}
		LottoNum(money);
		System.out.println("받은 금액은" + money + "원이고 거스름돈은" + 
							(money%1000)+"원입니다.");
	}
	public void LottoNum(int money) {
		Set<Integer> lottoSet = new HashSet<>();
		int amount = money/1000;
		
		System.out.println("로또 번호 출력하기");
		for(int i=1; i<=amount; i++) {
//			lottoSet.add((int)(Math.random()*45)+1);
//		ArrayList<Integer> lottoList = new ArrayList<Integer>(lottoSet);
//		System.out.println("로또번호" + i + ":" + lottoList);	
			while(lottoSet.size()<6) {
				lottoSet.add((int)(Math.random()*45)+1);
			}
		ArrayList<Integer> lottoList = new ArrayList<Integer>(lottoSet);
		System.out.println("로또번호" + i + ":" + lottoList);	
		lottoSet.clear();	
		}
		
	}
	public static void main(String[] args) {
		new LottoStore().Store_Menu();
	}

}
