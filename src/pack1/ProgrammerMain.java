package pack1;

public class ProgrammerMain {

	public static void main(String[] args) {
		// 
		System.out.println("이러저러 하다가");
		Programmer tom = new Programmer();
		System.out.println(tom.toString());  //객채변수 이름을 써주면 객채변수 주소가 나옴
		System.out.println(tom);    //객채변수 이름을 써주면 객채변수 주소가 나옴( 위에보다 간단 )
		System.out.println("tom의 별명은" + tom.nickName); //프로그래머 파일 닉네임 앞에 퍼블릭이 있어서 
	                                                                       	 //어디에서든 불러올 수 있음
		
		System.out.println("tom의 보유기술은" + tom.spec);
		//System.out.println("tom의 나이는" + tom.age); private 멤버임으로 외부 클래스에서 호출 불가!!!!
		//tom = null; //null을 만나면 값이 없기 때문에 오류뜸
		//System.out.println("tom의 별명은" + tom.nickName);
		
		tom.nickName = "자바 귀신";
		System.out.println("tom의 별명은" + tom.nickName);
		tom.displayData();
		tom.displayData();
		//tom.age;
		
		int nai = tom.getAge();
		System.out.println(" tom의 나이 : " + nai);
		tom.setAge(11, 22);
		nai = tom.getAge();
		System.out.println(" tom의 나이 : " + nai);
		
		System.out.println();
		System.out.println(tom.motto);
		System.out.println(Programmer.motto);
		//tom.PI = 1234.0; //err : final 멤버이므로 수정 불가능함.
		System.out.println(tom.PI);
		
		System.out.println();
		Programmer.myMethod();
		tom.myMethod2();
		
		
		System.out.println("==========");
		Programmer james = new Programmer();
		System.out.println("james의 별명은" + james.nickName);
		System.out.println("james의 보유기술은" + james.spec);
		james.displayData();
		
		
		System.out.println();
		System.out.println(tom.toString());
		System.out.println(james.toString());
		
		
		
	}

}








































