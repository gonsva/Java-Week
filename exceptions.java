class exceptions{

	public static void main(String xyz[]){

		int a,b,c;
		a=b=c=0;

		try{
			a=4;
			b=0;
			c=a/b;

			System.out.println("Result: "+c);
		}

		catch (NumberFormatException exp1){

			System.out.println("exp1");
		}
		catch (ArithmeticException exp2){

			System.out.println("Cannot divide by 0");
		}
	}
}