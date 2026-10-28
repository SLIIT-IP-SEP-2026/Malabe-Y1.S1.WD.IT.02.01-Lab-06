import java.util.Scanner;
 public class IT26102690Lab6Q3{
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  int count = 0;
  int num1 = 0;
  int total_of_squares = 0;
  System.out.println("Enter positive integers (terminate input with -99) : ");
	num1 = input.nextInt();
  while (num1 != -99)
  {
	if (num1 > 0) {
     System.out.println("Enter a number : ");
	 
	 num1 = input.nextInt();
	 int square = num1*num1; 
	 total_of_squares = total_of_squares + square;
	 count = count + 1;
   }else { System.out.println("Invalid input");
     break;
   }
  }
  
  
  if (count > 0) { 
   double mean_square = total_of_squares/count;
   double root_mean_square = Math.sqrt(mean_square); 
  System.out.println ("The root mean square (RMS) is :" + root_mean_square);}
  }
 }