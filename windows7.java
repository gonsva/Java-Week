import java.awt.event.*;
import java.awt.*;

class Action1 implements ActionListener{

	public void actionPerformed (ActionEvent x){

		System.out.println("its working!");
	}
}

class windows7{

	public static void main (String xyz[]){

		Frame win = new Frame();
		Button B1 = new Button("Click 1");
		Button B2 = new Button("Click 2");
		Button B3 = new Button("Click 3");
		Button B4 = new Button("Click 4");
		Button B5 = new Button("Click 5");

		Action1 e = new Action1();
		B1.addActionListener(e);

		win.add(B1, BorderLayout.NORTH);
		win.add(B2, BorderLayout.EAST);
		win.add(B3, BorderLayout.WEST);
		win.add(B4, BorderLayout.CENTER);
		win.add(B5, BorderLayout.SOUTH);

		win.setSize(400,400);
		win.setVisible(true);
	}
}

