package ch04_test;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int width = getWidth();
		int height = getHeight();
		int iWidth = 0;
		int iHeight = height;
		int i1LineCounter = 1;



		
		// Task 4.2
		 while (i1LineCounter <= 15){ //Top Left Corner
			 g.drawLine(0, iHeight, iWidth, 0);
			 iWidth = iWidth + (width / 15);
			 iHeight = iHeight - (height / 15 );
			 i1LineCounter +=1;
			 }
		
		 i1LineCounter = 1;
		 iWidth = 0;
		 iHeight = 0;
		 while (i1LineCounter <= 15){ // Top Right Corner
			 g.drawLine(iWidth, height, width, iHeight);
			 iWidth = iWidth - (width / 15);
			 iHeight = iHeight - (height / 15 );
			 i1LineCounter +=1;
		 }
		 
		 i1LineCounter = 1;
		 iWidth = 0;
		 iHeight = height;
		 while (i1LineCounter <= 15){ //Bottom Right Corner
			 g.drawLine(width, iHeight, iWidth, height);
			 iWidth = iWidth + (width / 15);
			 iHeight = iHeight - (height / 15 );
			 i1LineCounter +=1;
		 }

			//Task 4.1!
//			while (i1LineCounter <= 15) {
//				g.drawLine(0, 0, iWidth, iHeight);
//				iWidth = iWidth + (width / 15);
//				iHeight = iHeight - (height / 15);
//				i1LineCounter += 1;
//			}
	//
//			i1LineCounter = 1;
//			iWidth = 0;
//			iHeight = height;
//			while (i1LineCounter <= 15) {
//				g.drawLine(iWidth, iHeight, width, height);
//				iWidth = iWidth + (width / 15);
//				iHeight = iHeight - (height / 15);
//				i1LineCounter += 1;
//			}
	//
//			i1LineCounter = 1;
//			iWidth = width;
//			iHeight = height;
//			while (i1LineCounter <= 15) {
//				g.drawLine(width, 0, iWidth, iHeight);
//				iWidth = iWidth - (width / 15);
//				iHeight = iHeight - (height / 15);
//				i1LineCounter += 1;
//			}
	//
//			i1LineCounter = 1;
//			iWidth = width;
//			iHeight = height;
//			while (i1LineCounter <= 15) {
//				g.drawLine(0, height, iWidth, iHeight);
//				iWidth = iWidth - (width / 15);
//				iHeight = iHeight - (height / 15);
//				i1LineCounter += 1;
//			}	
	}

}
