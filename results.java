class results{
	public static void main (String xyz []){
		int phy, che, mat, total;
		float per;

		phy = 100;
		che = 100;
		mat = 100;
		total = phy + che + mat;
		per = total * 100/300;

		System.out.println ("Total Marks: "+ total);
		System.out.println (" Percentage: "+ per);

		if (per>=60){
			System.out.println ("Passed");
		}

			else{
				System.out.println ("Failed");
			}
		}
	}
