import java.util.Scanner;
public class IT26101664Lab6Q1{
	public static void main (String[] args ){
		Scanner input = new Scanner (System.in);
		
		System.out.print("enter a number:");
		double number = input.nextDouble();
		
		double square = number * number;
		double squareroot = Math.sqrt(number);
		
		System.out.println();
		System.out.println("the square of"+number + "is :"+ square);
		System.out.println("the squareroot of"+number + "is :"+ squareroot);
		
		input.close();
	}
}