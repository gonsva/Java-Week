
class countwords{

public void wordcount(String msg){
int word=1;
int i=0;

while (i<msg.length()){
	if (msg.substring(i,i+1).equals(" ")){
		word++;
	}
	System.out.println(word);
}
}
}


class StringProcessing{

	public static void main(String xyz[]){

		countwords ref=new countwords();

		ref.wordcount("one two");
		
	}
}