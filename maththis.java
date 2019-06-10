class math46{
	int a;

	public void message(){
		int a;
		a=20;
		this.a=15;

		System.out.println("Result: "+a);
	}

	public void message2(){

		System.out.println(a);
	}
}

class maththis{

	public static void main(String xyz[]){
		
		math46 x=new math46();
		
		x.message();
		x.a=5;
		
		x.message2();

	}
}