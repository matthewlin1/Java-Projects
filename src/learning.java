import java.util.Scanner;
public class learning {
	public static void main (String[]args) {
		System.out.println("This is a quadratic equation solver. To use it, type in the coefficients of the quadratic equation you want to solve. For example, if you wanted to find the solutions to the equation 3x^2+5x+8, you would type 3,5, and 8 into the console.");
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String c=sc.next();
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int z = Integer.parseInt(c);
		double solution1=Math.sqrt(y^2-4*x*z);//*0.5*2*x;
		/*double solution2=(-y-Math.sqrt(y^2-4*x*z))*0.5*2*x;*/
		System.out.println("The solution to the equation: "+a+"x^2+"+b+"x+"+c+" is x= "+solution1+", "/*+solution2*/);
	}
}
