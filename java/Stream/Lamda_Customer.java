package test1;

import java.util.Arrays;
import java.util.List;

public class Lamda_Customer {

	public static void main(String[] args) {

		List<Customer> list =  Arrays.asList(new Customer("김자바", 1500),
										new Customer("홍길동", 3000));
		list.stream().forEach(s-> System.out.println(s.getName()+s.getPoint()));
	}

}
