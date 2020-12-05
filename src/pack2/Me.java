package pack2;

public final class Me extends Father{   //Me의 sub class 작성 불가
	public Me() {
		System.out.println("내 생성자임을 선언하노라");
		
		
	}
	/*
	@Override
	public void showDate() {
		System.out.println("Me의 showDate");
	}
	
}
*/    //메소드에 final걸면 ovrride 불가
}