class bank{
	private int amount;
	public void deposit(int money){
		amount+=money;
	}
public void withdraw(int money){
	if (money<amount){
		amount-=money;
	}
	else{
		System.out.println("Not enough funds");
	}
}
public void balance(){
	System.out.println("Your balance is: "+amount);
}
public bank(){
	System.out.println("Nationwide Building Society");
}
}

class NBS{
	public static void main (String xyz []){
		bank ref;
		ref=new bank();
		ref.deposit(1000);
		ref.withdraw(500);
		ref.balance();

	}
}