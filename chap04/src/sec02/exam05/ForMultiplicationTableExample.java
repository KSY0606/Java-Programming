package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for (int m=2; m<=9; m++) { 						// <----바깥쪽 for문
			System.out.println("***" + m + "단 ***");
			for (int n=1; n<=9; n++) {					// <----중첩 for문
				System.out.println(m + "x" + n + "=" + (m*n));
			}
			} // 바깥쪽 for문이 1번 실행할때마다 중첩for문은 1~9까지 9번 반복 실행된다.

	}

}
