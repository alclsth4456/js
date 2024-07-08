package sub3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Account {
	
		private String acc;
		private String name;
		private int money;
		
		public List<Account> userList = new ArrayList<>();
	
	public Account(String acc, String name) {

			this.acc = acc;
			this.name = name;
			this.money = money;
		}


	@Override
	public String toString() {
		return "Account [계좌번호=" + acc + ", 예금주=" + name + ", 잔액=" + money + ", userList=" + userList + "]";
	}


	public Account() {
		// TODO Auto-generated constructor stub
	}


	public String getAcc() {
		return acc;
	}


	public void setAcc(String acc) {
		this.acc = acc;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	@Override
	public int hashCode() {
		return Objects.hash(acc, name);
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			Account user = (Account) obj;
			return obj.equals(user.name) && obj.equals(user.acc);
		}
		return false;
		

	}

	


}
