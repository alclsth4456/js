package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.*;

class Student1 {
String name;
int ban;
int no;
int kor,eng,math;

public Student1(String name, int ban, int no, int kor, int eng, int math) {
	super();
	this.name = name;
	this.ban = ban;
	this.no = no;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
}

int getTotal() {
	return kor + eng +math;
}

float getAverage() {
	return (int)((getTotal()/3f)*10+0.5) /10f;
}

@Override
public String toString() {
	return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
			+ math + ", getTotal()=" + getTotal() + ", getAverage()=" + getAverage() + "]";
}
}
class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student1 && o2 instanceof Student1) {
			Student1 s1 = (Student1)o1;
			Student1 s2 = (Student1)o2;
			if(s1.ban>s2.ban) {
				return 1;
			}else if(s1.ban==s2.ban){
				if(s1.no>s2.no)
				return 1;
				else 
					return -1;
			}
		}
			return -1;
	}
}
public class Ex11_4 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(new Student1("홍길동",1,1,100,100,100));
		list.add(new Student1("남궁성",1,2,90,80,70));
		list.add(new Student1("김자바",1,3,80,80,90));
		list.add(new Student1("이자바",1,4,70,90,70));
		list.add(new Student1("안자바",1,5,60,100,80));
		
		Collections.sort(list, new BanNoAscending());
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
