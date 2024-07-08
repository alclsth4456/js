package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UserTest {

	public static void main(String[] args) {

		User u1 = new User("몰입맨",10,3000);
		User u2 = new User("코딩맨",20,4000);
		User u3 = new User("코딩걸",15,3500);
		
		List<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		
		System.out.println("user name 출력");
		list.stream().map(u -> u.getName()).forEach(u ->
		System.out.println(u));  //리스트에서 이름만 출력
		
		System.out.println("user power 합계 출력");
		System.out.println(list.stream().mapToInt(u -> u.getPower()).sum());
		
		System.out.println("user level 15이상 출력");
		list.stream().filter(u-> u.getLevel()>=15)
					.map(u-> u.getName()).sorted()
					.forEach(u-> System.out.println(u));
		
			}

}
