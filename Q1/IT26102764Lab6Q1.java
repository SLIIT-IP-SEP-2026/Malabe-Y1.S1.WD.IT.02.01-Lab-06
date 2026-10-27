import java.util.Scanner;
  
  public class IT26102764Lab6Q1{
   
   public static void main( String[] args){
   
    // declare the variable
      int num;
	
    // create the object
      Scanner input = new Scanner(System.in);
	  
    // get user input for the variable
	  System.out.println("Enter number");
	  num = input.nextInt();
	  
	// declare the constants
	  int square;   // in maths square of whole numbers are considered as integers
	  double squareroot;
	  
	// declare the constants
	  square= num*num;
	  squareroot= Math.sqrt(num);
	  
	// display the output
	  System.out.println("Square value of "+ num +" is: " + square);
	  System.out.println("Square root value of " + num +" is: " + squareroot);
    }
}