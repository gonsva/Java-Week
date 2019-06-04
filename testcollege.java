class college{
	private int phy, che, total; float per;
	private void calculations(){

		total = phy+che;
		per = total*100/300;
	}

public void physics(int p){
	if (p>=0 && p<=150){

		phy = p;
	}
	else{
		phy=-1;
		System.out.println("Invalid Physics Marks");
	}
}

public void chemistry(int c){
	if (c>=0 && c<=150){

		che = c;
	}
	else{
		che=-1;
		System.out.println("Invalid Chemistry Marks");
	}
}

public void showresults(){
	if(che==-1||phy==-1){
		System.out.println("No Results");
	}
	else{
		calculations();
		System.out.println("Total Marks: "+total);
		System.out.println("Percentage: "+per);
	}
}
}
class testcollege{
	public static void main (String xyz []){

		college ref;
		ref=new college();
		ref.physics(150);
		ref.chemistry(150);
		ref.showresults();

	}
}

