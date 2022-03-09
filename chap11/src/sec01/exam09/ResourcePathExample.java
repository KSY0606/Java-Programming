package sec01.exam09;

public class ResourcePathExample {

	public static void main(String[] args) {
		
		Class clazz = ResourcePathExample.class; // ResourcePathExample 대신 Car를 써도 똑같은 출력이 나온다, 클래스의 위치가 같기떄문에
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);

	}

}
