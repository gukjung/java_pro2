package pack2;

public class Father  extends GrandFa {       //단일상속 : private 멤버를 제외한 나머지 자원을 자식에게 제공
	private int nai = 55;  //캡슐화
	//public String gabo = ": 꽃병";  //부모 멤버와 같은 멤버필드, 은닉화
	private final int house = 1;   //Father 고유멤버;  final들어가면 house수정 불가
	
	
	public Father() {
		super(); //부모 생성자 호출. 생략가능
		System.out.println("아버지 생성자");
		
	}
	
	  public Father(int n) {
		  super(n);
		  System.out.println("아버지 생성자");
		  
	  }
	  
	  public void abc() {
		  
	  }

	  @Override  //annotation 
	  public int getNai() {  //method override 
		  System.out.println("자식이 부모 메소드를 재정의 함");
		  return nai;
	  }
	
	  public int getHouse() { //father에만 가지고 있는 고유 메소드
		  return house;
	  }
	
	  public final void showDate() {  //제일먼저 메소드 컴퓨터  -> father(class)에 있는 꽃병 -> 이것도 없으면  grandfa에 있는 상감청자
		  										//final오면 오버라이드 불가
		  //String gabo = "컴퓨터";
		  System.out.println( " 가보 : " + gabo); 
		  System.out.println( " 가보 : " + this.gabo);
		  System.out.println( " 가보 : " + super.gabo);
		  getNai();       //현재 클래스에서  getNai 찾음 없으면 부모한테
		  this.getNai(); //현재 클래스에서  getNai 찾음 없으면 부모
		  super.getNai();  //부모클래스  getNai
		  
		
	  }
	  
	  
	
	
	

}
