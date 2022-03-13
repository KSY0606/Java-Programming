package sec01.exam25;

public class ValueCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 300; // 자동박싱
		Integer obj2 = 300;
		
		System.out.println("==결과 :" + (obj1 == obj2)); // 참조하는 포장객체의 번지가 다르기 때문에 false
		System.out.println("eqlus()결과 :" + (obj1.equals(obj2)));

		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과 :" + (obj3 == obj4));
		System.out.println("eqlus()결과 :" + (obj3.equals(obj4)));

	}

}
