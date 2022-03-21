package sec02.exam04;

import java.io.*;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception{

		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db"); // 바이트 기반 출력스트림을 생성하고 dataOutputStream 보조 스트림 연결
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동"); // 기본 타입값 출력
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); // 출력 스트림 닫기
		
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		dis.close();
	}

}
