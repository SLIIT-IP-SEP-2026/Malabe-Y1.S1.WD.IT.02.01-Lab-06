import java.util.Scanner;

public class IT26102449Lab6Q2C {
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int i = 1 ;
		int number;
		int sum = 0;
		double average;
		String numbers ="";
		
		while (i<=10) {
			System.out.print("Enter number" + i + ":") ;
			number=input.nextInt();
			
			numbers=numbers+number+" ";
			sum= sum + number ;
			i++;
		}
		
			average=sum/10.0;
		   
		    System.out.println("The numbers you entered are = "+numbers);
			
			System.out.println("Sum of the numbers= " +sum );
			System.out.println("Average of the numbers = " +average );
			
		}
	}
