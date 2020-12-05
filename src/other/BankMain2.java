package other;

//import pack1.Bank;  //다른 패키지 불러옴  pack1 안에 Bank
//import pack1.Animal;

import pack1.*; // pack에 있는 모든 클래스 부를 수 있음


public class BankMain2 {

	public static void main(String[] args) {
		// 다른 패키지의 클래스 호출
		
		Bank john = new Bank();  
		System.out.println(john.imsi2);
		//john.imsi2; // 접근지정자가 public인 경우 다른 패키지에서 참조 가능
		//john.imsi;  // 접근지정자가 default인 경우 다른 패키지에서 참조 불가
		System.out.println(john.getMoney());
		

	}

}
