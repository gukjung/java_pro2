package pack1;

public class Animalmain {

	public static void main(String[] args) {
	  Animal tiger = new Animal();
	  tiger.display();
	  tiger.display(5);
	  tiger.display("호돌이");
	  tiger.display(3, "호랑이");
	  tiger.display("포돌이", 7);
	  
	  System.out.println();
	  System.out.println(Animal.KEYBOARD);
	  Animal.abc();
	  
	  
	 System.out.println("\n생성자 오버로딩 ---");
	 Animal lion = new Animal("늑대", 2);
	 lion.display();
	 
	 
	 System.out.println();
	 Animal hen = new Animal(2);
	 hen.display();
	 hen.display(1, "통닭");
	}

}
