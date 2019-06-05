class two extends one{
	
	int b;

	public void msg2(){
	System.out.println("my friends");
	}
}

class twotest{

	public static void main(String xyz []){
		
		two ref=new two();
		ref.msg();
		ref.msg2();
	}
}