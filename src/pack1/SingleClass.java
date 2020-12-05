package pack1;

public class SingleClass {
	int kor = 90;
	
	
	private static SingleClass sc = new SingleClass();
	public static SingleClass getInstance() {
		return sc;
	}
	

}
