class bank{
	static int dollar;
	public void setdollar(int a){
		dollar=a;
	}
	public void amount(int b){
		System.out.println("Amount is: "+(b*dollar));
	}
}

class testbank{
	public static void main(String xyz[]){
		
		bank hsbc, netwest, nbs;
		
		hsbc=new bank();
		netwest=new bank();
		nbs=new bank();

		hsbc.setdollar(100);
		hsbc.amount(1000);

		netwest.setdollar(100);
		netwest.amount(1000);

		nbs.setdollar(100);
		nbs.amount(1000);
	}
}