package test1;

import java.util.Arrays;
import java.util.List;

public class Stream_Member {

	public static void main(String[] args) {

		List<Member> list = Arrays.asList(new Member("홍두깨", Member.Male,30),
										new Member("홍길동", Member.Female,29),
										new Member("김자바", Member.Male, 32),
										new Member("안재홍", Member.Male,27));
		
		int cnt = 0;
		double sum = 0;
		
		//외부 반복자
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getGender()==Member.Male) {
				sum+= list.get(i).getAge();
				cnt++;
			}
				
		}
		double ageAvg = sum/cnt;
		System.out.println("남자 회원의 평균 나이: " + ageAvg);
	}
}
