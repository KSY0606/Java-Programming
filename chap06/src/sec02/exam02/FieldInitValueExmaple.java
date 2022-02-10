package sec02.exam02;

public class FieldInitValueExmaple {

	public static void main(String[] args) {
		
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println(fiv.byteField); 
		System.out.println(fiv.charField); // 유니코드0은 빈공백이 출력됨
		System.out.println(fiv.shortField);
		System.out.println(fiv.intField);
		System.out.println(fiv.longField);
		
		System.out.println(fiv.booleanField);
		
		System.out.println(fiv.floatField);
		System.out.println(fiv.doubleField);
		
		System.out.println(fiv.arrField);
		System.out.println(fiv.strField);
		
	}

}
