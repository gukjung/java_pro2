package pack1;

public class PohamHandle {  //자체적으로는 의미없고 다른 클래스의 멤버로 사용할 목적
	int quntitiy; // 회전량
	
	public PohamHandle() {
		 quntitiy = 0;
		 
	}
	String leftTurn(int q) {
		 quntitiy = q;
		 return "좌회전";
	}
	String rightTurn(int q) {
		 quntitiy = q;
		 return "우회전";
	}
	
	String straight(int q) {
		 quntitiy = q;
		 return "직진";
	}
}
