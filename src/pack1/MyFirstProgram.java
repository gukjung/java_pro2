package pack1;

public class MyFirstProgram {

	public static void main(String[] args) {
		// 응용 프로그램의 시작 메소드
		System.out.println("프로그램 짜보자");
		int kbs = 9;
		System.out.println("Tv는" + kbs);
		System.out.println("-------------");
		Car car1 = new Car();  //객체 생성(instance)
		//Car car1 = null; // java.lang.NullPointerException 오류뜨면 주소를 생성해주지 않은것
		System.out.println("wheel : " + car1.wheel);
		System.out.println("irum : " + car1.irum);
		System.out.println("engine : " + car1.engine);
		car1.abc();
		System.out.println(car1); //pack1.Car@5305068a : car1의 주소
		
		
		
		System.out.println("---------");
		System.out.println("프로그램 종료");
		
		
		
		
	}

}
