package sub4;

public class IngeritanceTest {

	public static void main(String[] args) {
		
		//상속 객체 생성
		Sedan car1 = new Sedan("소나타","흰색",0,2000);
		car1.speedUp(100);
		car1.speedDown(40);
		car1.show();
		Sedan car2 = new Sedan("봉고","흰색",0,2000);
		car2.speedUp(100);
		car2.speedDown(20);
		car2.show();
		
		//StockAccount
		//bank, acc, name, balance, stock, amount, price
		//public StockAccount(String bank, String acc, String name, int balance, int stock, int amount, int price
		StockAccount kb = new StockAccount("kb", "101-11-1111","김소진", 10000, "삼성전자",0 , 50000);
		kb.deposit(1000000);
		kb.buy(10,50000);  //amount, price
		kb.sell(5,40000);  //amount, price
		
		Doctor d = new Doctor("김춘추", 30,"소아과");
		Engineer e = new Engineer("김유신", 33,"소프트웨어");
		
		d.work();
		e.work();
		
		
	}
}
