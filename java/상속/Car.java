package sub4;

public class Car {

	//상속관계에서 자식한테 참조할수 있도록 protected로 해줘야됨
	protected String name;
	protected String color;
	protected int speed;
	
	//클래스변수(정적변수)
	public static int count;
	
	//생성자; 캡슐화된 클래스 속성을 초기화하는 메서드
	public Car(String name, String color, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	//클래스 메서드(정적 메서드)
	public static int getTotalCount() {
		
		return count;
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}

	public void show() {

		System.out.println("차량명:" + name);
		System.out.println("차량색:" + color);
		System.out.println("현재속도:" + speed);
		
	}


}
