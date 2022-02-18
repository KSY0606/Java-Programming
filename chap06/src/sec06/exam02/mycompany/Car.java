package sec06.exam02.mycompany;


import sec06.exam02.hyundai.Engine; // Engine클래스를 가져와줘야 7라인에 컴파일오류가 발생하지 않음
import sec06.exam02.hankook.SnowTire; // .SnowTire 대신 .*;를 사용해도 됨
import sec06.exam02.kumho.BigWidthTire;

public class Car {
	//Field
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	 
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();	
	//서로 다른 패키지에 같은 이름인 클래스가 있을경우 구분을 제대로 해줘야함
	
}
