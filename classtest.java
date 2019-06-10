class second{

	public second(){
		System.out.println("Hello");
	}
}

class first extends second{

	public first(){
		System.out.println("my");
	}
}

class one extends first{

	public one(){
		System.out.println("friend");
	}
}

class two extends one{

	public two(int a){
		System.out.println("this");
	}

	public two(){
		this(9);
		System.out.println("works");
	}
}

class classtest{

	public static void main(String xyz[]){

		two x=new two();
	}
}