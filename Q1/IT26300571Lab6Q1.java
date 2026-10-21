import java.util.Scanner;
public class IT26300571Lab6Q1 {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println( "Enter a number");
		int number = input.nextInt();
		
		int square = number*number;
		double square_Root = Math.sqrt (number );
		
		System.out.println(" The square of " + number + "is :" + square );
		System.out.println(" The square root of " + number + "is :" + square_Root );
	}
}