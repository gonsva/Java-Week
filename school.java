class results{
	int phy, che, mat;

	public void showresults() {
		int total;
		total = phy + che + mat;

		System.out.println ("Total score: " + total);

		if (total == 300) { 
			System.out.println ("passed");
		}

			else {
				System.out.println ("Failed");

			}}
	}

class school{
	public static void main(String xyz[]){
		results Peter, James;

		Peter= new results();
		James= new results();

		Peter.phy=100;
		Peter.che=100;
		Peter.mat=100;

		James.phy=100;
		James.che=100;
		James.mat=100;

		Peter.showresults();
		James.showresults();
	}
}