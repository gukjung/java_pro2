package pack1;

public class Car {  //[접근지정자][기타제한자] class 클래스명
	int wheel;   //멤버필드(멤버변수 , 전역변수)
	public int engine = 1;
	private int airBag = 1;  //[접근지정자][기타지정자] type 변수명(멤버필드)
	private int speed;      //캡슐화
	public String irum;
	
	public  Car () {  //임의 호출 불가, new에 의해 호출, 생성자에 의해 호출
		// Constructor ( 생성자 ) : 객체 생성 시 가장 먼저 수행되는 메소드 
		//초기화률 담당
		System.out.println("난 생성자야");
		irum = "홍길동";
		wheel = 4;
		int mbc = 11;  //지역변수
		
	}

	public void abc () {  // 멤버 메소드 [접근지정자][기타지정자] 반환형 메소드형 (argument, . .){}
		System.out.println("abc 메소드 수행");
		int sbs = 5; //지역변수
		def(); //private 메소드 호출
		
	}
	
	
	
	private void def() { 
		System.out.println("def 메소드 수행");  //안에서만 호출가능
		
	}
	
	void efg() {
		System.out.println("efg 메소드 수행");  //클래스 밖에서도 호출가능
	}
		
}







































