import java.util.Scanner;
public class IT26102683Lab6Q1{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number:s");
		
		int number = input.nextInt();
		
		double square = number*number;
		double root = Math.sqrt (number);
		
		System.out.println("The Square of" +number+ " is : "+square);
		System.out.println("The Square root of" +number+ " is : "+root);
	}
}