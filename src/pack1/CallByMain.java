package pack1;

public class CallByMain {

	public static void main(String[] args) {
		// 메소드 호출시 argument 값 또는 주소를 전달 할 수 있다.
		CallBy1 my = new CallBy1();
		CallBy2 your = new CallBy2();
		
		System.out.println("0. 원래 a :  " + my.a + " , b : " + my.b );
		
		your.ex(my.a, my.b);  //인수로 기본형 변수(값) 전달  //위의 my a 와 my b 의 값을 마음대로 바꾸고 싶다
		System.out.println("1-1. 수행 후 a :  " + my.a + " , b : " + my.b );
		
		
		System.out.println();
		your.ex(my); //인수로 참조형 변수(주소) 전달 // CallBy2 와 주소가 같음
		System.out.println("2-1. 수행 후 a :  " + my.a + " , b : " + my.b );
		
		System.out.println();
		your.ex(my.c);
		System.out.println("3. 수행 후 c[0] :  " + my.c[0] + " , c[1] : " + my.c[1] );
		
		
		
		
		
		
	}

}
