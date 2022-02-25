package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound(); // 실체클래스의 Dog의 sound 메소드가 출력
		cat.sound();
		
		Animal animal = null;
		
		animal = new Dog(); // 타입이 animal 인 변수에 Dog객체를 준거로 타입변환이 됨
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) { 
		animal.sound();
		
	}
}
