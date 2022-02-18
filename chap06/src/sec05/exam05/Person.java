package sec05.exam05;

public class Person {
	//  한번 값이 저장되면 바꿀 수 없게 앞에 final을 붙여줌
	final String nation = "Korean";	// 국적 
	final String ssn; 	//주민번호처럼 객체마다 다른 값을 가지고있는 final필드는 생성자에서 초기화 시켜준다
	String name; // final이 없기 때문에 값을 언제든 바꿀 수 있다
	
	Person(String ssn, String name){
		this.ssn = ssn; // 외부로부터 받은 값을 가지고 fianl필드인 ssn에 값을 제공해주게된다
		this.name = name;
	}
}
