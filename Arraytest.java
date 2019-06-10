class Arraytest{

	String firstnames[] = {"Valentine", "Tom"};
	String lastnames[] = new String[firstnames.length];

	public void printnames(){
		int i=0;

		System.out.println(firstnames[i]
			+ " " + lastnames[i]);
		i++;

		System.out.println(firstnames[i]
			+ " " + lastnames[i]);
		i++;
	}

	public static void main(String xyz[]){

		Arraytest ref= new Arraytest();

		ref.lastnames[0]="Gonsalves";
		ref.lastnames[1]="Smith";
		ref.printnames();
	
}
}