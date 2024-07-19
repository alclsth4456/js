package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test6 {

	public static void main(String[] args) {

		//60~100 사이의 임의수 10를 더하므로 값이 항상 다름
		printList(createList());
	
	}
	
	public static void printList(List<Integer>scoreList) {//main에서 호출하기위해 static
		int total = 0;
		int size = scoreList.size();
				
		for(int i = 0; i < size; i++) {
			int score = scoreList.get(i);
			total += score;
			
			System.out.print(score);
			
			if(i == size -1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
		}
		System.out.println(total);
	}
		 public static List<Integer> createList() {
		        List<Integer> scoreList = new ArrayList<>();
		        Random rand = new Random();
		        
		        for (int i = 0; i < 10; i++) {
		            int num = rand.nextInt(41) + 60; // 60~100 사이의 랜덤 수 생성
		            scoreList.add(num);
		        }
		        return scoreList;
		}
	}


