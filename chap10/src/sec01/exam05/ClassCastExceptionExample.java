package sec01.exam05;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		Animal animal = dog; // �ڵ�Ÿ�� ��ȯ���� ����
		Dog dog2 = (Dog) animal;
		
		Cat cat = new Cat();
		Animal animal2 = dog; // dog�� �����ϴµ� cat���� �ٲٶ�� �ϱ⶧���� ClassCastException�� �߻��Ѵ�
		Cat cat2 = (Cat) animal2;
		

	}

}
