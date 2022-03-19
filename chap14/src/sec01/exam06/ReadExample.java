package sec01.exam06;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/Temp/test3.db");
		
		byte[] buffer = new byte[5];
		
		int readByteNum = is.read(buffer, 2, 3); // 입력스트림으로부터 3byte를 읽고 buffer[2].buffer[3],buffer[4]에 각각 저장
		if(readByteNum != -1) { // 읽은 바이트가 있다면
			for(int i = 0; i < buffer.length; i++) { // 배열 전체를 읽고 출력한다
				System.out.println(buffer[i]);
			}
		}

		is.close();
	}

}
