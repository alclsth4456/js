package sub4;

public class StockAccount extends Account{

	
	private String stock;
	private int amount;
	private int price;
	
	

	public StockAccount(String bank, String acc, String name, int balance, String stock2, int amount2, int price2) {
super(bank, acc, name, balance);
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}


	public void buy(int price, int amount) {
		if(balance < 2500) {
			System.out.println("잔액이 부족합니다.");
		}else {
			balance -=  amount * price;
			amount++;
//			System.out.println("결제되었습니다.");
		}
	}
		
	public void sell(int price, int amount) {
		this.balance += amount*price;
		this.amount --;
	}


	public void show() {
		System.out.println("bank" + bank);
		System.out.println("name" +name);
		System.out.println("acc" + acc);
		System.out.println("balance" + balance);		
		System.out.println("" + stock);
		System.out.println("" + amount);
		System.out.println("" + price);
	}
	
	
}
