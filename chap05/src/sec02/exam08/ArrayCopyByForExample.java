package sec02.exam08;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		
		int[] oldIntArray = {1, 2, 3 };
		int[] newIntArray = new int[5]; // 배열은 길이가 결정되면 늘릴수 없기 때문에 새로운 배열을 만들어준다.

		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; // 원본배열의 i인덱스 값을 새로운 배열의 i인덱스에 저장한다. 
		}
		for(int i = 0; i < newIntArray.length; i++) {	// newIntArray.length 총길이가 5로 5번 반복됨.
			System.out.println(newIntArray[i] + ",");
		}
		}

	}

