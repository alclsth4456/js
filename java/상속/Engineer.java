package sub4;

public class Engineer extends Person{

	private String field;
	
	public Engineer(String name, int age, String field) {
		super(name, age);
		this.field = field;
	}
	
	public void work() {
		System.out.println("제이름은 " + name + "이고 나이는 " + age +"세 입니다.\n"
				+ "저는" + field + "입니다.");
	}

	
}
