class digits{

	public void ones(int){
		int num;
		a="";
		switch(ones){

			case 1: System.out.println("one"); break;
			case 2: System.out.println("two"); break;
			case 3: System.out.println("three"); break;
			case 4: System.out.println("four"); break;
			case 5: System.out.println("five"); break;
			case 6: System.out.println("six"); break;
			case 7: System.out.println("seven"); break;
			case 8: System.out.println("eight"); break;
			case 9: System.out.println("nine"); break;
			case 10: System.out.println("ten"); break;
			case 11: System.out.println("eleven"); break;
			case 12: System.out.println("twelve"); break;
			case 13: System.out.println("thirteen"); break;
			case 14: System.out.println("fourteen"); break;
			case 15: System.out.println("fifteen"); break;
			case 16: System.out.println("sixteen"); break;
			case 17: System.out.println("seventeen"); break;
			case 18: System.out.println("eighteen"); break;
			case 19: System.out.println("ninteen"); break;
			
		}
	}
	public void tens(int){
		int num;
		a="";
		switch(tens){

			case 20: System.out.println("twenty"); break;
			case 30: System.out.println("thirthy"); break;
			case 40: System.out.println("fourty"); break;
			case 50: System.out.println("fifty"); break;
			case 60: System.out.println("sisty"); break;
			case 70: System.out.println("seventy"); break;
			case 80: System.out.println("eighty"); break;
			case 90: System.out.println("ninty"); break;
			}
		}

	public void thousand(int){
	if (num>=1000 && num<=9000){
		a+=ones(int num/1000)+ "Thousand";
		num=num%1000;
	}
}

	public void hundred(int){
	if (num>=100){
		a+=ones(int num/100)+ "hundred";
		num=num%100;
	}
}
	public void twenty(int){
	if (num>=20){
		a+=tens(int num/10) + " ";
		num=num%10;
	}
}
	public void ten(int){
	if (num>=0 && num<=19){
		a+=ones(num);
	}
}
}

	

class digittonumbers{
	public static void main(String xyz[]){

		digits ref;
		ref=new digits();
		ref.

		}
	}