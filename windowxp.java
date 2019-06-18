import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class windowxp{

	public static void main(String xyz[]){

		Frame f=new Frame("calculations");
		TextField T1,T2,T3;
		Label L1,L2,L3;

		Button B1=new Button("+");
		Button B2=new Button("-");
		Button B3=new Button("/");
		Button B4=new Button("x");
		L1=new Label("First No: ");
		L2=new Label("Second No: ");
		L3=new Label("Third No: ");

		T1=new TextField(10);
		T2=new TextField(10);
		T3=new TextField(10);

		FlowLayout fl=new FlowLayout();
		f.setLayout(fl);

		Ehandler e=new Ehandler(T1, T2, T3);
		Thandler t=new Thandler(T1, T2, T3);
		Dhandler d=new Dhandler(T1, T2, T3);
		Mhandler m=new Mhandler(T1, T2, T3);
		B1.addActionListener(e);
		B2.addActionListener(t);
		B3.addActionListener(d);
		B4.addActionListener(m);

		f.add(L1);
		f.add(T1);
		f.add(L2);
		f.add(T2);
		f.add(B1);
		f.add(B2);
		f.add(B3);
		f.add(B4);
		f.add(L3);
		f.add(T3);

		f.setSize(400,400);
		f.setVisible(true);
	}
}





class Ehandler implements ActionListener{

	TextField no1, no2, result;

	public Ehandler(TextField a, TextField b, TextField c){

		no1=a;
		no2=b;
		result=c;
	}

	public void actionPerformed(ActionEvent x){

		int a,b,c;

		a=Integer.parseInt(no1.getText());
		b=Integer.parseInt(no2.getText());
		c=a+b;
		result.setText(Integer.toString(c));
	}
}

class Thandler implements ActionListener{

	TextField no3, no4, result2;

	public Thandler(TextField d, TextField e, TextField f){

		no3=d;
		no4=e;
		result2=f;
	}

	public void actionPerformed(ActionEvent x){

		int d,e,f;

		d=Integer.parseInt(no3.getText());
		e=Integer.parseInt(no4.getText());
		f=d-e;
		result2.setText(Integer.toString(f));
	}
}

class Dhandler implements ActionListener{

	TextField no5, no6, result;

	public Dhandler(TextField a, TextField b, TextField c){

		no5=a;
		no6=b;
		result=c;
	}

	public void actionPerformed(ActionEvent x){

		int a,b,c;

		a=Integer.parseInt(no5.getText());
		b=Integer.parseInt(no6.getText());
		c=a/b;
		result.setText(Integer.toString(c));
	}
}

class Mhandler implements ActionListener{

	TextField no7, no8, result;

	public Mhandler(TextField a, TextField b, TextField c){

		no7=a;
		no8=b;
		result=c;
	}

	public void actionPerformed(ActionEvent x){

		int a,b,c;

		a=Integer.parseInt(no7.getText());
		b=Integer.parseInt(no8.getText());
		c=a*b;
		result.setText(Integer.toString(c));
	}
}