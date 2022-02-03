package sec02.exam01;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {			// int i=1;은 초기화식,  1<=10; 조건식,  i++증감식
			System.out.println(i);	        //i가 11이 되는 순간 false가 되어 8라인이 실행된다. 
		}

	}

}
