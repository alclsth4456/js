package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.xml.ws.handler.MessageContext.Scope;

public class Student2 {
	
	
	private 	String name;
	private 	int kor;
	private 	int eng;
	private 	int math;
	private 	int total;
	private 	int avg;
	
	
	public Student2(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}
	
	
	@Override
	public java.lang.String toString() {
		return " [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + getTotal() + ", avg=" + getavg();
	}
	public int getTotal() {
		return kor+eng+math;
	}
	public double getavg() {
		return (kor+eng+math)/3.0;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	
	
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        List<Student2> list = new ArrayList<>();

	//        print(list);

	        // 총점
//	        int total = list.stream().mapToInt(Student2::getTotal).sum();

//	        Score(sc, list);
//	    }

	//    public static void Score(Scanner sc, List<Student2> list) {
	    	while (true) {
	        System.out.println("성적관리 프로그램" + "\n" + "1.성적입력 2.성적출력 3.성적수정 4.성적삭제 5.종료");
	        int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    insert(sc, list);continue;
	                    
	                case 2:
	                    print(list);
	                    continue;
	                case 3:
	                    modify(sc, list);
	                    continue;
	                case 4:
	                    delete(sc, list);
	                    continue;
	                case 5:
	                    System.out.println("프로그램을 종료합니다.");
	                    return;
	                default:
	                    System.out.println("번호를 잘못입력하였습니다.");
	                    return;
	            }
	        }
	    }

	    static void insert(Scanner sc, List<Student2> list) {
	        System.out.println("이름");
	        String name = sc.next();
	        System.out.println("국어");
	        int kor = sc.nextInt();
	        System.out.println("영어");
	        int eng = sc.nextInt();
	        System.out.println("수학");
	        int math = sc.nextInt();
	        list.add(new Student2(name, kor, eng, math));
	      
	    }

	    static void print(List<Student2> list) {
	        for (Student2 student : list) {
	            System.out.println(student);
	        }
	    }

	    static void modify(Scanner sc, List<Student2> list) {
	    	System.out.println("수정할 학생의 이름");
	    	String name = sc.nextLine();
	    	
	    
	    }

	    static void delete(Scanner sc, List<Student2> list) {
	        // 삭제 로직 작성
		
		
	    	
	}

	

}
