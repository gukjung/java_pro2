package pack2;

public class DogMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.print();
		System.out.println(dog.callName());
		
		System.out.println("-------------");
		HouseDog hd = new HouseDog("집개");
		hd.print();
		hd.show();
		System.out.println(hd.callName());
		
		
		System.out.println("-------------");
		WolfDog wd = new WolfDog("늑대");
		wd.print();
		System.out.println(wd.callName());
		wd.display();
		
		
		System.out.println();
		System.out.println("^^^^^^^^^");
		WolfDog bushdog = wd;
		bushdog.print();
		
		System.out.println();
		Dog dog2 = wd;  //dog2는 dog, wd는 wolfdog, sub 객채의 주소는 부모 객채에 치환할 수 있음
								//promotion  이라함.
								//	그 후에 부모 class로 sub class를 부름
		dog2.print();   //overriding된 값만 가능
		// dog2.display(); 자식 고유의 메소드는 부모 class에 간섭할 수 없기 때문에 오류
		
		
		
		System.out.println();
		//Dog dog3 = dog;
		Dog dog3 = hd;
		dog3.print();
		
		
		
		System.out.println();
		dog2 = wd;
		dog2.print();
		
		System.out.println();
		WolfDog bushdog2 = wd;   //dog2는 부모객체이기 때문에 dog2 못옴 주소는 wd의 주소를 
											//가지고있음
		WolfDog bushdog3 = (WolfDog)dog2;
		bushdog3.print();   //casting 자식객채에 부모객채이기는 하나 자식의 부모를 가지고 있다면
		                    	//casting에 의해 가질 수 있긴하다.
		
		
		System.out.println("%%%%%%%%%%%%%%%%");
		Dog coyote = new Dog("코요테");
		coyote.print();
		
		
		System.out.println();
		coyote = bushdog;
		coyote.print();
		
		System.out.println();
		coyote = hd;
		coyote.print();
		
		
		
		
	}

}







































