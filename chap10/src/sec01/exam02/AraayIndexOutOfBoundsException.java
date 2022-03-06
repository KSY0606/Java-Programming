package sec01.exam02;

public class AraayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
				
		int result = arr[0] + arr[2];  // 마지막 인덱스 번호는 2이기때문에 int result = arr[0] + arr[3];이면 에러가 발생한다
		
		// args의 실행매개변수가 없이 12,13라인을 작성할 경우 AraayIndexOutOfBounds가 발생한다
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println(data1);
		System.out.println(data2);

	}

}
