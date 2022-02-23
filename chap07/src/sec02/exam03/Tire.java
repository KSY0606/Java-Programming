package sec02.exam03;

public class Tire {
	//필드
	public int maxRotation; // 최대 회전수
	public int accumulatedRotation;	// 누적회전수
	public String location;	//	 타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation) { // 외부로부터 타이어의 위치, 최대 회전수를 입력받음
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//메소드
	public boolean roll() { // 회전을 할 수 있다면 true 할 수 없다면 false를 리턴하기 위해 boolean을 사용
		++accumulatedRotation; // 회전수를 1씩 증가시킴
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation)+ "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크***");
			return false;
			}
		}
	}

