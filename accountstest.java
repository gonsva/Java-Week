class accounts{
	public void tax(){
		System.out.print("Tax Rate is: "+22.7);
	}
	public void tax(int salary){
		double t;
		t=salary*22.7/100;
		System.out.println("Your tax is: "+t);
	}
	public void tax(int salary,double tax_rate){
		double t;
		t=salary*tax_rate/100;
		System.out.println("your tax is: "+t);
	}
}

class accountstest{
	public static void main (String xyz []){
		accounts ref=new accounts();
		ref.tax();
		ref.tax(1000);
		ref.tax(1000,40);
	}
}