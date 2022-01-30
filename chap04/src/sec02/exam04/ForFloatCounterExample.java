package sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {  // 0.1f로 초기화, x가 1.0이하일때만 반복, 반복할때마다 x에 0.1f를 추가
			System.out.println(x);
		}
					// 반복되면서 x가 0.1보다 커져버리므로 10번출력이 되지않고 9번만 반복됨. 
	}

}
