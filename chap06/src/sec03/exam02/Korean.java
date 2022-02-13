package sec03.exam02;

public class Korean {
	//Field
	
	String nation = "대한민국";
	String name;
	String ssn; 	// name, ssn은 생성자에서 객체를 만들때 제공될 예정.
	
	//constructor
	Korean(String n, String s){
		name = n;
		ssn = s;		// Field를 초기화하는 코드.
	}
}
