class maths2 extends maths{

	public void multiplication(int a, int b){
		System.out.println("Results: "+ (a*b));
	}

}

class testmaths{

public static void main(String xyz []){

	maths2 ref = new maths2();

	ref.add(3,3);
}
}