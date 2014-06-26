package ch04_test;

import javax.swing.JFrame;

public class DrawPaneTest {
	public static void main (String [] args){
		
		DrawPanel panel = new DrawPanel();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add( panel );
		application.setSize(400, 400);
		application.setVisible(true);
		
	}
	
}
