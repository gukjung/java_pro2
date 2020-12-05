package pack1;

public class PohamCarMain {

	public static void main(String[] args) {
		// 클래스 포함관계 연습
		PohamCar tom = new PohamCar("톰");
		tom.turnHandle(30);
		System.out.println(tom.ownerName + "의 회전량은" + tom.turnShow + " " + tom.handle.quntitiy);  
		//quntitiy는 handle안에 상속되어 있기때문에 handle 먼저 하고 . 찍고 quntitiy 찾아야 됨
		
		tom.turnHandle(-10);
		System.out.println(tom.ownerName + "의 회전량은" + tom.turnShow + " " + tom.handle.quntitiy);
		
		
		
		System.out.println();
		PohamCar kildong = new PohamCar("길동");
		kildong.turnHandle(0);
		System.out.println(kildong.ownerName + "의 회전량은 : " + kildong.turnShow + " " + kildong.handle.quntitiy);  
		
	
	}

}
