package sec02.exam04;

public class Anonymous {
	private int field;
	
	public void method(int arg1, int arg2) { // final을 작성하지않아도 final특성을 가지고 있어 값을 변경할 수 없다
		int var1 = 0; // 로컬변수
		int var2 = 0;
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
			int result = field + arg1 + arg2 + var1 + var2;
			return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
