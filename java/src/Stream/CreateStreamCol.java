package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateStreamCol {

	public static void main(String[] args) {
		//배열도 배열 클래스가 존재
				//배열안에 약간의 메서드(기능)
				//배열 클래스안에 배열orArrayList을 만드는 메서드: asList(데이터 나열)
				List<String> list1=new ArrayList<>();
				list1.add("Toy");
				list1.add("Robot");
				list1.add("Box");
				List<String> list = Arrays.asList("Toy","Robot","Box");
				
				//스트림 생성하기:컬렉션 인스턴스
				//void accept(T t)
				list.stream().forEach(s-> System.out.println(s));
				
	}

}
