class taxabstract2 extends taxabstract{
	public void tax(int salary){

	double result=salary*20/100;
	System.out.println("Tax: "+result);
}
}


class caltax{

public static void main(String xyz []){

	taxabstract2 ref = new taxabstract2();

	ref.tax(6000);
	ref.msg(5000);
	ref.msg(15000);
	ref.msg(25000);
	ref.msg(35000);

}
}