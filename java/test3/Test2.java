package test3;

class King {
	private String name;
	private int year;
	
	public King(int year) {
		this("정조");
		this.year = year;
	}
	

	public King(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	
	public King(String string) {

	}


	public void show() {
		System.out.println("name: "+ name);
		System.out.println("year:" + year);
		
	}
	
}
public class Test2 {

	public static void main(String[] args) {

		King k1 = new King("태조", 1392);
		King k2 = new King("태조", 1392);
		King k3 = new King("태조", 1392);
		
		k1.show();
		k2.show();
		k3.show();
		
	}

	
}
