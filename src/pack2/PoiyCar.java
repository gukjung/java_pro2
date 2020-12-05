package pack2;

public class PoiyCar {
	protected int speed = 30;  //protected는 자식을 거느릴거야~
	
	public PoiyCar() {
		System.out.println("난 자동차야~~~");
		
	}

	public void dispData() {
		System.out.println("속도 : " + speed);
	}
	
	public int getSpeed () {
		return speed;
	}
}
