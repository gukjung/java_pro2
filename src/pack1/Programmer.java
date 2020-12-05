package pack1;

public class Programmer {
	//public String nickName;         null 이 초기치
	public String nickName = "";  //공백이 초기치
	String spec = " 자바 ";
	//private int age = 0;   //초기값 0
	private int age;           //초기값 0
	
	public static String motto = "자바에 미치자"; //static 멤버
	public final double PI = 3.14;  //final : 수정 불가

	
	public Programmer() { 
		System.out.println("난 생성자. 초기화 담당");
		System.out.println("초기화 작업이 없다면 적지 않아도 컴파일러가 인정");
		nickName = "자바 체질";
	 
		
		
		
	}
	
	public void displayData() {
		//String sp = spec; //지역변수
		int version = 14;
		String sp = reSpec(version); //메소드 탈출
		System.out.println("별명이" + nickName +"은"+ age + "살, 보유기술은" + sp);
	}
	
	private String reSpec(int ver ) { //int ver = version
		String imsi = " 언어 중 " + spec + ver; 
		// String imsi = " 언어 중 " + spec + ver + Integer.toString(ver); //위랑 같은거
		return imsi;
		
				
	}
	//private 멤버를 외부 클래스에서 참조(읽기)
	//public int nice() {
	public int getAge() {  //getter  //
		//System.out.println("age:" + age);
		return age;
		
		
	}
	
	//public void good(int aa) { //setter    private 멤버를 외부 클래스에서 참조( 값 수정 )
		public void setAge(int password, int age) { 
			if(password == 11) {
				this.age = age;	
			} else {
				System.out.println("비밀번호 불일치로 값 변경 불가");
				
			}
		
	}
	
		
		public static void myMethod() {  //void앞에 static걸면 오류뜸 age에 new를 만들기전에
			                              // static으러 new를 만들고 부르려해서 오류
			//System.out.println("나이는" + age); 
			System.out.println("motto" + motto); 
			
		}
	
		public void myMethod2() {
			System.out.println("나이는" + age);
			System.out.println("motto" + motto); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
