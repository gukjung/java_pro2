package sample;

import java.awt.Frame;

public class MyFrame2 extends Frame{
	
	
	public MyFrame2 () {
		//super("상속연습");
	}
    public void display() {
    	setTitle("상속연습");
    	setSize(500, 300);
    	setLocation(200,150);
    	setVisible(true);
    	
    	
    }
	
	
	public static void main(String[] args) {
		MyFrame2 frame2 = new 	MyFrame2();
		frame2.display();
		

	}

}
