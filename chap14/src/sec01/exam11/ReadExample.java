package sec01.exam11;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception{

		Reader reader = new FileReader("C:/Temp/test7.txt"); // 데이터 출발지를 test7.txt로 하는 문자 기반 파일 입력스트림을 생성
		
		while(true) {
			int data = reader.read(); // 한 문자씩 읽기
			if(data == -1) break; // 파일 긑에 도달했을 경우
			System.out.println((char)data);
		}
		reader.close(); // 입력스트림을 닫음
	}

}
