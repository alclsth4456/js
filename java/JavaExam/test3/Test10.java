package test3;

interface buyer {
	
	public void buy();
}
interface Seller {
	public void sell();
}
class Customers implements buyer,Seller {

	@Override
	public void sell() {

		System.out.println("판매하기");
	}

	@Override
	public void buy() {

		System.out.println("구매하기");
	}
	
}


public class Test10 {

	public static void main(String[] args) {

		buyer buy = new Customers();
		Seller sell = new Customers();
		
		buy.buy();
		sell.sell();
		
	
	}

}
