package sec04.exam06;

public class Calculator {
	//Field
	//Constructor
	//Method

	//정사각형의 넓이		한 면의 길이가 구해지는 매개변수 선언
	double areaRectangle(double width) { 
		return width * width;
	}
	//직사각형의 넓이
	double areaRectangle(double width, double height) { // 매개변수를 하나 더 추가해 가로의 크기,세로의 크기를 받게됨
		return width * height;
}	// areaRectangle로 이름이 똑같고 매개변수의 수가 다른 이런 메소드를 메소드오버로딩이라고 한다
}
