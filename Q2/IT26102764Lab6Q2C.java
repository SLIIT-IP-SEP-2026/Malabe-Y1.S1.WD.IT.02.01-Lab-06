import java.util.Scanner;
  
  public class IT26102764Lab6Q2C{
     
	public static void main ( String[] args){
	
	// declare the variables
	 int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,sum;
	 double avg;
	 
	 
	// create the object 
	  Scanner input= new Scanner(System.in);
	  
	// get user input 
	 System.out.println(" Please enter 10 numbers:");
	 
	// get 10 numbers from the user
	 System.out.println();
	 
	 System.out.println(" Enter number 1:");
	 num1= input.nextInt();
	 
	 System.out.println(" Enter number :");
	 num2 = input.nextInt();
	 
	 System.out.println(" Enter number 3:");
	 num3= input.nextInt();
	 
	 System.out.println(" Enter number 4:");
	 num4 = input.nextInt();
	 
	 System.out.println(" Enter number 5:");
	 num5 = input.nextInt();
	 
	 System.out.println(" Enter number 6:");
	 num6 = input.nextInt();
	 
	 System.out.println(" Enter number 7:");
	 num7 = input.nextInt(); 
	 
	 System.out.println(" Enter number 8:");
	 num8 = input.nextInt();
	 
	 System.out.println(" Enter number 9:");
	 num9 = input.nextInt();
	 
	 System.out.println(" Enter number 10:");
	 num10 = input.nextInt();
	 
	// display the output
	 System.out.println();
	 System.out.println(" The numbers you entered are:");
	 System.out.println(num1 +" "+ num2 +" "+ num3 +" "+ num4 +" "+ num5 +" "+ num6 +" "+ num7 +" "+ num8 +" "+ num9 +" "+ num10);
	 
	// calculate sum of the 10 numbers
	 System.out.println();
	 sum = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
	 System.out.println(" The sum of the numbers: " + sum);
	 
	// calculate the average of the 10 numbers
	 avg = sum/10;
	 System.out.println(" Average of the numbers: " + avg);
	 
	}
	
  }