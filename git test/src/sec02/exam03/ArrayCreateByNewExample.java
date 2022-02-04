package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];  // int배열 길이3을 만들어 대입.
		for(int i=0; i<3; i++) {  // 인덱스는 0부터 시작한다; 마지막 인덱스는 2이므로 3미만일때까지 반복한다; 1번 반복할때마다 1씩 증가한다. 
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}

		arr1[0] = 10;  		// 각 인덱스에 다른값을 저장하고싶다면 12,13,14라인처럼 입력해준다.  
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3]; 		// double 타입 배열 변수 선언 
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		arr2[0] = 0.1;			// 인덱스에 새로운 값을 저장하고싶다면...
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];		// 배열을 생성하는데 저장할 수 있는 요소의 수는 3이다.
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}

}
