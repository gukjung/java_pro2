package pack1;
//Method overload 연습 - 동일한 이름의 메소드 (인수는 다름)를 여러개 선언
public class Animal {
	private int leg = 4;
	private int age = 3;
	private String name;
	
	public final static int KEYBOARD = 1;
	
	
	
	public Animal() {  // Constructor 
		// 적어줄 내용이 없으면 생략 가능
	}
		
	public Animal(int leg) {  // Constructor overloading
		this.leg = leg;
		// 적어줄 내용이 없으면 생략 가능
	}
	
	public Animal(String name) {  // Constructor overloading
		// 적어줄 내용이 없으면 생략 가능
		this.name = name;
	}
	
	public Animal(String name, int age) {  // Constructor overloading
		// 적어줄 내용이 없으면 생략 가능
		this.name = name;
		this.age = age;
	}
	
	
	
	public void display() {
			System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
		}
		
	public void display(int nai) {  // Method overloading
		age = nai;
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
		
		public void display(String name) {  // Method overloading
		this.name = name;
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + this.name);
	}
		public void display( int nai, String name ) {  // Method overloading   //갯수가 다르고 타입이달라고 overloading 이 성립되기 때문에 순서 바꿔도됨(원래는 나이가 먼저고 네임이 뒤였음)
			this.name = name;
			age = nai;
			System.out.println("leg: " + leg + ", age: " + age + ", name: " + this.name);
		}
		
		
		public void display( String name, int nai) {  // Method overloading   //갯수가 다르고 타입이달라고 overloading 이 성립되기 때문에 순서 바꿔도됨(원래는 나이가 먼저고 네임이 뒤였음)
			this.name = name;
			age = nai;
			System.out.println("leg: " + leg + ", age: " + age + ", name: " + this.name);
		}
		
		/*public void display( int leg) //int가 leg랑 age 두개이기 때문에 성립안됨
			this.leg = leg;
			System.out.println("leg: " + leg + ", age: " + age + ", name: " + this.name);
		}
		*/
		/*public void display( String name, int leg) {  // Method overloading   //갯수가 다르고 타입이달라고 overloading 이 성립되기 때문에 순서 바꿔도됨(원래는 나이가 먼저고 네임이 뒤였음)
			this.name = name;
			age = nai;
			System.out.println("leg: " + leg + ", age: " + age + ", name: " + this.name);
		}
		*/
		
		/*public int display(int nai) {  // Method overloading
			age = nai;
			System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
		}
		*/
		
		public static void abc() {
			System.out.println(KEYBOARD);
		}
		
		
		
		
		
		
		
}
