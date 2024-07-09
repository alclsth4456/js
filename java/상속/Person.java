package sub4;

public class Person {

	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void work() {
		System.out.println("person is working");
	}
	
	public void introduce() {
		System.out.println("제 이름은 " + name + "이고 나이는 " + age + "세입니다.");
	}
	
	
} 
