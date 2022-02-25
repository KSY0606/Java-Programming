package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound(); // ��üŬ������ Dog�� sound �޼ҵ尡 ���
		cat.sound();
		
		Animal animal = null;
		
		animal = new Dog(); // Ÿ���� animal �� ������ Dog��ü�� �ذŷ� Ÿ�Ժ�ȯ�� ��
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
