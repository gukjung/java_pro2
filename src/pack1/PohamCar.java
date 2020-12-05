package pack1;

public class PohamCar {  //완성차 클래스
	int speed =0;
	String ownerName, turnShow;
	PohamHandle handle;   //오버 클래스를 멤버필드로 사용 : 클래스의 포함관계 (has a)
	
	
	public PohamCar() {
		// TODO Auto-generated constructor stub
	}
	public PohamCar(String name) {
		ownerName = name;
		handle = new PohamHandle();
		
	}
	
	void turnHandle(int q) {
		if(q > 0) turnShow = handle.rightTurn(q);   // trunShow가 우회전이라는 뜻을 가지고 있음
		if(q < 0) turnShow = handle.leftTurn(q);     // trunShow가 좌회전이라는 뜻을 가지고 있음
		if(q == 0) turnShow = handle.straight(q);   // trunShow가 직진이라는 뜻을 가지고 있음

	}
	
	
	
	
	
	
	
	
	
	
}
