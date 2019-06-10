class string2int{

	public static void main (String abc[]){

		int first,second,results;
		first=second=results=0;

		try{

			first= Integer.parseInt(abc[0]);
			second= Integer.parseInt(abc[1]);
			results= first/second;

			System.out.println("Result; "+results);
		}

		catch(NumberFormatException e){

			System.out.println("Digits only please");
		}

		catch(IndexOutOfBoundsException e){

			System.out.println("Not enough values");

		}

		catch(ArithmeticException e){
			System.out.println("Cannot divide by 0");
		}

	}
}