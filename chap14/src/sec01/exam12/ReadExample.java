package sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception{

		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		char[] buffer = new char[100]; // 길이 100인 배열 생성
		
		while(true) {
			int readCharNum = reader.read(buffer); // 배열 길이만큼 읽기
			if(readCharNum == -1) break; // 파일 끝에 도달했을 경우
			for(int i = 0; i < readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
			reader.close();
	}

}
