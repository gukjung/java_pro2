package pack2;

public class Dog {    //개과의 파생클래스를 위한 슈퍼클래스
	private String name = "댕댕이";
	
	public Dog() {
		
	}
	
public Dog(String name) {
	this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	public String callName() {
		return "종류 : " + name;
		
	}
	public void print() {
		System.out.println(name + " : 땅위에 산다. ");
	}
	

}
