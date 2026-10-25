import java.util.Scanner;
public class IT26101731Lab6Q1{
    public static void main(String[] args){
	
	double number,square,square_root;
	
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter a number:");
	number=input.nextDouble();
	
	square=number*number;
	square_root=Math.sqrt(number);
	
	System.out.println("The square of "+number+" is: "+square);
	System.out.println("The square root of "+number+" is: "+square_root);
	}
}
	