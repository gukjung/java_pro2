package pack2;

public class PolyMain {

	public static void main(String[] args) {
		// 다형성 연습
		PoiyCar car1 = new PoiyCar() ;
		PliyBus bus1 = new PliyBus();
		PolyTaxi taxi1 = new PolyTaxi();
		
		car1.dispData();
		System.out.println(car1.getSpeed());
		
		
		System.out.println("=======");
		bus1.dispData();
		bus1.show();
		System.out.println(bus1.getSpeed());
		
		
		System.out.println("=======");
		taxi1.dispData();	
		System.out.println(taxi1.getSpeed());
		
		
		System.out.println("\n*******************");
		PoiyCar car2 = new PliyBus();
		car2.dispData();
		//car2.show(); 파생클래스 고유 메소드이므로 에러;
		System.out.println(car2.getSpeed());
		
		
		
		System.out.println();
		PoiyCar car3 = taxi1;
		car3.dispData();
		System.out.println(car3.getSpeed());
		
		System.out.println("@@@@@@@@@");
		//PliyBus bus2 = new PoiyCar();
		PliyBus bus2 = (PliyBus)car2;  // 부모타입이지만 자식의 주소를 가지고있어서 캐스팅 가눙\
		bus2.dispData();
		bus2.show();
		System.out.println(bus2.getSpeed());
		
		
		System.out.println();
		// PolyTaxi taxi2 = new PoiyCar(); 부모자식 안됨
		PolyTaxi taxi2 = (PolyTaxi)car3;
		taxi2.dispData();
		//PolyTaxi taxi3 = (PolyTaxi)car1;  //실행 오류 : class pack2.PoiyCar cannot be cast to class pack2.PolyTaxi
													//(pack2.PoiyCar and pack2.PolyTaxi are in unnamed module of loader 'app')
													//at pack2.PolyMain.main(PolyMain.java:51)

		System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^마무리다 시발");
		PoiyCar p[] = new PoiyCar[3]; //배열을 선언
		p[0] = car1;
		p[1] = bus1;
		p[2] = taxi1;
		
		System.out.println("p.length : " + p.length);
		for(int a = 0; a < p.length; a++) {
			p[a].dispData();
		}
		
		System.out.println("여기까지");
		for(PoiyCar hi:p) {    //향상되는 for 문~
			hi.dispData();
			System.out.println();		
		}
	}
}
