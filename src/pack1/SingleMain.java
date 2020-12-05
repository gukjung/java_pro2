package pack1;

public class SingleMain {

	public static void main(String[] args) {
		// Gof의 디자인 패턴 중 싱글톤
		SingleClass s1 = new SingleClass();
		SingleClass s2 = new SingleClass();
		System.out.println(s1.kor);
		System.out.println(s2.kor);
		System.out.println(s1 + " " + s2);
		
		System.out.println("---------------");
		SingleClass s3 = SingleClass.getInstance();
		SingleClass s4 = SingleClass.getInstance();
		System.out.println(s3.kor);
		System.out.println(s4.kor);
		System.out.println(s3 + " " + s4);
		
		

	}

}
