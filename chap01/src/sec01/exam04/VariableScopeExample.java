package sec01.exam04;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5; // v2 변수는 if블록에서 사용되어 컴파일 에러가 발생한다.
	}
	}