package test4;

public class Banana {

	private String country;
	private int price;
	
	public void show() {
		System.out.println("원산지: " + country);
		System.out.println("가격: " + price);
	}
	
	public Banana(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Banana [country=" + country + ", price=" + price + "]";
	}
	
	
}
