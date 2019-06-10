class printwords{

public void printcount(String msg){

String  word="";
int i=0;

while (i<msg.length()){
	if (msg.substring(i,i+1).equals(" ")){
		System.out.println(word);
		word="";
	}
	else{
		word=word+msg.substring(i,i+1);
	}
	i++;
}
	System.out.println(word);
}
}





class printwordperline{

	public static void main(String xyz[]){

		printwords ref=new printwords();

		ref.printcount("one two");
		
	}
}