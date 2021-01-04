import java.util.Scanner;
public class Blackjack2playerversion
{
	public static void main(String[]args) {
	
	//public void run() {
String[]numbers={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
String[]suits={"clubs","diamonds","hearts","spades"};
int number;
int suit;
int total1=0;
int total2=0;
String myHand1="";
String myHand2="";
Scanner sc=new Scanner(System.in);
String x=sc.next();


while(!(x.equals("q"))) {
//while (x!="Quit") {
	if(x.equals("Start")) {
		System.out.println("Enter 1 for Player 1, 2 for Player 2, q to Quit. Player 1's Turn");
		x=sc.next();
	}
	else if(x.equals("1")) {
		number=(int)(13*Math.random());
		suit=(int)(4*Math.random());
		total1=total1+number+1;
		myHand1 =myHand1+numbers[number]+" of "+suits[suit]+",";
		if(total1>=21) {
				System.out.println("Player 1's Hand is: "+myHand1);
				System.out.println("Total is: "+total1);
				System.out.println("Player 1's total exceeds 21. Player 2 wins, Game over!");
				break;
		}
		else {
		System.out.println("Player 1's Hand: "+myHand1);
		System.out.println("Total is: "+total1);
		System.out.println("Enter 1 for Player 1, 2 for Player 2, q to Quit. Player 2's Turn");
		x=sc.next();
		}
	}
	else if(x.equals("2")) {
		number=(int)(13*Math.random());
		suit=(int)(4*Math.random());
		total2=total2+number+1;
		myHand2 = myHand2+numbers[number]+" of "+suits[suit]+",";
		//x=sc.next();
		if(total2>=21) {
			System.out.println("Player 2's Hand is: "+myHand2);
			System.out.println("Total is: "+total2);
			System.out.println("Player 2's total exceeds 21. Player 1 wins, Game over!");
			break;
		}
		else {
		System.out.println("Player 2's Hand is: "+myHand2);
		System.out.println("Total is: "+total2);
		System.out.println("Enter 1 for Player 1, 2 for Player 2, q to Quit. Player 2's Turn");
		x=sc.next();
		}
	}
	else {
		System.out.println("Invalid command");
		x=sc.next();	
	}
		
	
}
sc.close();
System.out.println("closed resource, exiting...");
}
}
/*
public static void main(String [ ] args)
{
	Blackjack bj = new Blackjack();
            // Deliver the robot to the origin (1,1),
            // facing East, with no beepers.
      bj.run();
}
*/

