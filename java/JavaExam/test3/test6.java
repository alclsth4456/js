package test3;

class Addr {
	private static Addr instance = new Addr();
	public static Addr getInstance() {
		return instance;
	}
	
	private Addr() {}
	
	private Addr(int value) {
		y += value;
	}
	
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x;
		y++;
	}
	
	public void add(int [] arr) {
		this.x += arr[0];
		this.y += arr[1];
	}
	
	public static void add(Addr a2) {
		a2.x += 10;
	}
	
	public static Addr add(Addr a3, int value) {
		return new Addr(value);
	}
	
	public void show() {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
	
	
}

	public class test6 {
	public static void main(String[] args) {

		Addr a1 = Addr.getInstance();
				
		a1.add(1,2);
		a1.show();
		
		int[] arr = {10, 20};
		a1.add(arr);
		a1.show();
		
		Addr.add(a1);
		a1.show();
		
		a1 = Addr.add(a1, 3);
		a1.show();
	}
	}

