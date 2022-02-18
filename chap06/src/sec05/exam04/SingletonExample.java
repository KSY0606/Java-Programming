package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		/* Singleton obj1 = new Singleton();
		   Singleton obj2 = new Singleton();  	private이 사용되어 컴파일에러 발생	*/


		Singleton obj1 = Singleton.getInstance(); // 필드에 저장된 번지를 리턴하게 됨
		Singleton obj2 = Singleton.getInstance();
		
		// obj1,obj2가 참조하는 객체가 같은지 확인
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}

}
