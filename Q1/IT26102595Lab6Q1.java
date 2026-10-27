import java.util.Scanner;
 public class IT26102595Lab6Q1{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
	 
	 System.out.print("Enter a number");
	  int number = input.nextInt();
	  
	  int square;
	  double squareroot;
	  square = number*number;
	  squareroot = Math.sqrt(number);
	  
	  System.out.println("the square of:"+number+"is"+square);
	  System.out.println("the square root of:"+"is"+squareroot);
	 
 
 
 
   }
 }