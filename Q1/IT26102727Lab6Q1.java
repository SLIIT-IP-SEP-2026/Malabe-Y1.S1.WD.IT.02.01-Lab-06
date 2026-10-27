import java.util.Scanner;
 public class IT26102727Lab6Q1{
	public static void main(String[] args)
	{ double number,square,squareroot;
      Scanner input=new Scanner(System.in);
	  
	 System.out.print("Enter the Number:");
	 number=input.nextDouble();
	 
	 square=number*number;
	 squareroot=Math.sqrt(number);
	 
	 System.out.println("square:"+square);
	 System.out.println("squareroot:"+squareroot);
	 
	}
    }                            
