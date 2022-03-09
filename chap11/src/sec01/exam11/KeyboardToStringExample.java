package sec01.exam11;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception {
		
		byte[] bytes = new byte[100]; // 길이 100짜리 바이트배열 생성
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2); // 입력되는 값에 \n, \r는 제외시키기위해 -2를 해준다
		System.out.println(str);

	}

}
