package sec02.exam04;

public class Anonymous {
	private int field;
	
	public void method(int arg1, int arg2) { // final�� �ۼ������ʾƵ� finalƯ���� ������ �־� ���� ������ �� ����
		int var1 = 0; // ���ú���
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