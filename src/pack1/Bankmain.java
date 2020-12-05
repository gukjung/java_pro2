package pack1;

public class Bankmain {
	public static void main(String[] args) {
		// package, 객체 주소, 참조 범위
		Bank tom = new Bank();
		tom.dePosit(5000);
		tom.withDraw(3000);
		System.out.println("tom의 예금액: " + tom.getMoney());
		tom.withDraw(7000);  //-4000
		
		System.out.println();
		Bank oscar = new Bank(5000);
		oscar.dePosit(5000);
		oscar.withDraw(3000);
		System.out.println("oscar의 예금액: " + oscar.getMoney());
		
		System.out.println("\n 객체 주소 관련 ---------");
		System.out.println("tom : " + tom);
		System.out.println("oscar : " + oscar);
		System.out.println("oscar : " + oscar.hashCode());  //10진수로 묶는것 hashCode
		
		Bank james = null;
		System.out.println("james : " + james);
		// System.out.println("james의 예금액 : " + james.getMoney()); instance가 없는데 예금액을 볼라해서 에러?
		james = oscar;  //값의 치환이 아니라 주소를 치환
		System.out.println("james의 예금액 : " + james.getMoney());
		System.out.println("james : " + james);
		System.out.println("oscar : " + oscar);
		
		
		System.out.println();
		if(james == oscar)
			System.out.println("둘은 주소 같음"); 
		else
			System.out.println("둘은 주소가 다름");
		
		if(james == tom)
			System.out.println("둘은 주소 같음"); 
		else
			System.out.println("둘은 주소가 다름");
			
		if(james instanceof Bank)  // instanceof : 클래스 타입 비교 연산자
			System.out.println("Bank 타입");
		else
			System.out.println("Bank 타입x");
		
		System.out.println("\n String type 값의 비교 -----------------");
		
		String ss1 =  "kor";
		String ss2 = new String();
		ss2 = "kor";
		String ss3 = new String("kor");
		String ss4 = new String();
		ss4 = "kor";
		System.out.println(ss1 + " " + ss2 + " " + ss3 + " " + ss4);
		
		if(ss1 == ss2)
			System.out.println("같음1");
		else
			System.out.println("다름1");
		
		if(ss1 == ss3)
			System.out.println("같음2");
		else
			System.out.println("다름2");
		
		if(ss2 == ss3)
			System.out.println("같음3");
		else
			System.out.println("다름3");   //  String을 비교할때는 다 같은 kor이지만 만들어지는 방법이 달라서 같지 않음
		if(ss2 == ss4)
			System.out.println("같음4");
		else
			System.out.println("다름4");  // String  객채의 값을 비교시 ==이 아니라 객체변수명 .equals()을 사용
		
		if(ss1 .equals(ss2))
			System.out.println("같음1");
		else
			System.out.println("다름1"); 
		
		if(ss1 .equals(ss3) )   // 대소문자 구분
			System.out.println("같음2");
		else
			System.out.println("다름2");
		
		if(ss2 .equalsIgnoreCase(ss3))     // 대소문자 구분
			System.out.println("같음3");
		else
			System.out.println("다름3");
		
		
		System.out.println("\n배열-----------");
		int ar1[] = {1, 2, 3};
		System.out.println(ar1);  //배열의 대표명은 배열객체
		System.out.println(ar1[0] + " " + ar1[2]);
		
		System.out.println();
		int[][] ar2 = {{1,2,3,} , {4,5,6,7}};
		System.out.println(ar2);
		System.out.println(ar2[0]);
		System.out.println(ar2[1]);
		System.out.println(ar2[1][3]);
		
		
		
		
		
		
		
		
		
		
		
	}

}

























