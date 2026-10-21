import java.util.Scanner;
 public class IT26101289Lab6Q1{
	 public static void main (String[]args){
		 double num,square,squareRoot;
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter a number : " );
		 
		 num = input.nextDouble();
		 square = num * num ;
		 squareRoot = Math.sqrt(num);
		 
		 System.out.println();
		 System.out.println("The square of " + num + " is : " + square);
		 System.out.println("The squreRoot of " + num + " is : " + squareRoot);
		 
	 }
 }