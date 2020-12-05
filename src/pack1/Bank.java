package pack1;


public class Bank {
	private int money = 1000;  // 가입 푹하금으로 1000원 은행에서 넣어 줌
	
	int imsi = 10;
	public int imsi2 = 20;   // public은 같은 프로젝트에서 다른 패키지로 불러오는거 가능
	
	public Bank() {
		
	}

      public Bank(int money) {
		this.money += money;
	}

	public void dePosit(int amout) { //입금
		if (amout > 0) money += amout;
		
		
	}
	
	public void withDraw(int amout) {
		if((amout > 0) && (money - amout >= 0)) {
			money -= amout;
		} else {
			System.out.println("출금액이 잔고보다 많아요");
			}
	}
	public int getMoney() { //잔금확인 getter
		return money;
	}

	
}
