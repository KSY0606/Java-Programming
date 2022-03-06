package sec01.exam05;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		Animal animal = dog; // 자동타입 변환으로 가능
		Dog dog2 = (Dog) animal;
		
		Cat cat = new Cat();
		Animal animal2 = dog; // dog를 참조하는데 cat으로 바꾸라고 하기때문에 ClassCastException이 발생한다
		Cat cat2 = (Cat) animal2;
		

	}

}
