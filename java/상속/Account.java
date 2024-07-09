package sub4;

public class Account {

	protected  String bank;
	protected String acc;
	protected String name;
	protected int balance;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(String bank, String acc, String name, int balance) {
		super();
		this.name = name;
		this.acc = acc;
		this.bank = bank;
		this.balance = balance;
	}
	
	public void deposit(int balance) {
		this.balance += balance;
	}
	
//	public void sell(int balance) {
//		this.balance -= price;
//	}
	
//	public void show() {
//		System.out.println(bank);
//		System.out.println(name);
//		System.out.println(acc);
//		System.out.println();
//	}
}
