package pack2;

//import hava.lang.Object; 오브젝 만들때 만들어져 있어서 안만들어도됨

public class MyObj extends Object {
	
	public MyObj() {
		System.out.println("MyObj");
	}
	
	@Override
	public String toString() {
		return "자격증 만세";
	}

	public static void main(String[] args) {
		MyObj obj = new MyObj();
		System.out.println(obj);
		System.out.println(obj.toString());
	

	}

}
