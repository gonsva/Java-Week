class results{
	private int phy, che, mat;

	public void showresults() {
		int total;
		total = phy + che + mat;

		System.out.println ("Total score: " + total);
	}

	public void Physics(int p){
		if (p>=0 && p<=150){
			phy=p;}
		else {
			System.out.println("Invalid Physics marks");
		}
	}

	public void Chemistry(int c){
		if (c>=0 && c<=150){
			che=c;}
		else {
			System.out.println("Invalid Chemistry marks");
		}
	}

	public void Maths(int m){
		if (m>=0 && m<=150){
			mat=m;}
		else {
			System.out.println("Invalid Maths marks");
		}
		}
	}
	
class school2{
	public static void main( String xyz []){
		results Peter,James;

		Peter=new results();
		James=new results();

		Peter.Physics(100);
		Peter.Chemistry(100);
		Peter.Maths(100);


		James.Physics(100);
		James.Chemistry(100);
		James.Maths(100);

		Peter.showresults();
		James.showresults();
	}
}
