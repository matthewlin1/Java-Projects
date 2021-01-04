import java.util.Scanner;
public class Blackjacksingleplayerversion {
	public static void main (String []args) {
		String[]numbers={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[]suits={"clubs","diamonds","hearts","spades"};
		int number;
		int suit;
		int total=0;
		String Playerhand="";
		String Comphand="";
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		
		
		if(x.equals("Start")) {
			System.out.println("Rules");
			System.out.println("Type 1 to draw, and 2 to pass that turn.");
			System.out.println("After 4 turns, the player and computer's hands will be revealed.");
			x=sc.next();
		}
		while(!(x.equals("q"))) {
			for(int i=1; i<=4; i++) {
				if(x.equals("1")) {
				number=(int)(13*Math.random());
				suit=(int)(4*Math.random());
				total=total+number+1;
				Playerhand=Playerhand+numbers[number]+" of "+suits[suit]+", ";
					if(total>=21) {
					System.out.println("Your hand is "+Playerhand);
					System.out.println("Total exceeds 21! Computer is the winner!");
					break;
					}
					else {
					System.out.println("Your hand is "+Playerhand);
					System.out.println("Total: "+total);
					}
				}
			
				else if(x.equals("2")) {
				System.out.println("Your hand is "+Playerhand);
				System.out.println("Total: "+total);
				}
				else{
				System.out.println("Invalid command");				
				}	
				if(i>=4) {
					break;
				}
				x=sc.next();
			}
			System.out.println("\n");
			System.out.println("Revealing hands:");
			System.out.println("Playerhand is: "+Playerhand);
			break;
		}
		sc.close();
		System.out.println("Closed resource, exiting");
	}
}

