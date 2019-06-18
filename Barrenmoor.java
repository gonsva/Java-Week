import java.util.Scanner;

public class Barrenmoor {
	public static void main(String args[]){
		
			Scanner c= new Scanner(System.in);
			Scanner ref= new Scanner(System.in);
			Scanner n= new Scanner(System.in);
			
			System.out.println ("You Awaken to find yourself in a barren moor. Try 'look'");
			
			
				boolean searchlook = false;
			
				do	{
					String word = c.nextLine();

					if (word.equals("look")) {
						searchlook = true; 
					}
					else {
						System.out.println ("Try Again!");
					}
					} while (searchlook ==  false);
				

					System.out.println ("Grey foggy clouds float oppressively close to you, reflected in the murky grey water which reaches up your shins.");
					System.out.println("Some black plants barely poke out of the shallow water. Try “north”,”south”,”east”,or “west”");
					System.out.println("You notice a small watch-like device in your left hand. It has hands like a watch, but the hands don’t seem to tell time.");
					System.out.println("");
					System.out.println("Move north to begin");
		              
		               
		               boolean searchword = false;
		   			
						do	{
							String word2 = n.nextLine();

							if (word2.equals("north")) {
								searchword = true; 
							}
							else {
								System.out.println ("Try 'north'");
							}
							} while (searchword ==  false);
		               
					System.out.println("You are moving in the right direction!");
					
						boolean searchword2 = false;
			   			
						do	{
							String word2 = n.nextLine();

							if (word2.equals("west")) {
								searchword2 = true; 
							}
							else {
								System.out.println ("Try 'west'");
							}
							} while (searchword2 ==  false);
		               
					System.out.println("The dial reads ‘1m’, Your getting closer!");
		              
					boolean searchword3 = false;
		   			
					do	{
						String word2 = n.nextLine();

						if (word2.equals("west")) {
							searchword3 = true; 
						}
						else {
							System.out.println ("Try 'west'");
						}
						} while (searchword3 ==  false);
	               
				System.out.println("You see a box sitting on the plain. Its filled with treasure! You win! The end.");
		               

					}}
				
			