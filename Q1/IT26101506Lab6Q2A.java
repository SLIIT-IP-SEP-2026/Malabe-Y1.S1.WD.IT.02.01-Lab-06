import java.util.Scanner;

public class IT26101506Lab6Q2A{
	public static void 	main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.println("Enter number");
		number = input.nextInt();
		
		int square;
		double squareroot;
		
		square=number * number;
		squareroot=Math.sqrt(number);
		
		System.out.println("Squrae value of "+ number +" is "+square);
		System.out.println("Square root value of "+ number +" is "+ squareroot);
	}
}
		
		
		
		
