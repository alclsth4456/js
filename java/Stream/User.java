package Stream;

public class User {

	private String name;
	private int level;
	private int power;
	
	
	public User(String name, int level, int power) {
		super();
		this.name = name;
		this.level = level;
		this.power = power;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", level=" + level + ", power=" + power + "]";
	}
	
	
}
