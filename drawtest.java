class drawtest{

	public static void main(String xyz[]){
		
		line x=new line();
		letsdraw(x);

		circle c=new circle();
		letsdraw(c);
	}


	public static void letsdraw(draw d){
		d.drawing();
	}
}