package sec01.exam27;

public class MathRandomExample {

	public static void main(String[] args) {

		int num = (int)(Math.random() * 10) + 1; 
		System.out.println("num: " + num);
				// random을 통해 임의의 범위내의 난수를 쉽게 얻을수 있게됨
		int num2 = (int)(Math.random() *6) + 1;
		System.out.println("주사위의 눈: " + num2);
	}

}
