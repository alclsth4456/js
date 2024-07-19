package test4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test10 {

	public static void main(String[] args) {

		String path = "C:\\Users\\eldorado\\Desktop\\Gugudane.txt";
		
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for(int x = 2; x <= 9; x++) {
//					System.out.println(x + "단");
				fw.write(x + "단\n");  //파일 생성
					
				for(int y = 1; y <= 9; y++) {
					int z = x*y;
//					System.out.println(x+"x" + y+"="+z);
					fw.write(x+"x" + y+"="+z+"\n");
				}
			}
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("구구단 파일생성 완료..");
	}

}
