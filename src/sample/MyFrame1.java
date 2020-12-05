package sample;

import java.awt.Frame;

public class MyFrame1 {
private Frame frame;
	
	public MyFrame1() {
		frame = new Frame("포함연습");
		//display();
	}
	
	public void display() { 
		frame.setSize(500 , 300);          //창 크기
		frame.setLocation(200, 150);     //창 만드는곳 좌표지정
		frame.setVisible(true);             //창 띄우기
		
	}
	
	public static void main(String[] args) {   //응용프로그램 시작점
		MyFrame1 flame1 = new MyFrame1();
		flame1.display();
		
	}
	
	
}

		

