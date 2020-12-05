package pack2;

public class GrandFa {
	private int nai = 80;
	public String gabo = "상감청자";
	protected String gahun = " 착하게 살자";
	
	
	public GrandFa() {  //생성자
		System.out.println("할아버지 생성자");
		
	}
	public GrandFa(int nai) {  //생성자 오버로딩
		this(); //자신의 또 다른 생성자 호출(무조건 먼저 불러야됨) <- 이거는 위에 할아버지 생성자를 또 생성하고 밑에 나이를함
		this.nai = nai;   // 자신의 멤버를 부를때는 this
	}
	
	
	protected String say() {   //자식이면 패키지가 달라도 부를 수 있지만, 자식이 아니면 쓸 수 없음
		return "할아버지 말씀 : 자바에 미쳐라";
	}
	
	void eat() { //패키지가 다르면 부를 수 없음
		System.out.println("밥은 맛있게...");
		
	}
	public /*final*/ int getNai() {  //여기에 fianl걸면 파터에 오류생김
		return nai;
	}
	
}
