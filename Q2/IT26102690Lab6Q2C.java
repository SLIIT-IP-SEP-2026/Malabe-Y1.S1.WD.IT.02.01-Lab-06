import java.util.Scanner ;
public class IT26102690Lab6Q2C{
	public static void main (String[] args){
		int num,userIn,sum;
		double avg;
		String mystr = "";
		num = 1;
		sum = 0 ;
		Scanner input = new Scanner(System.in);
		System.out.println("Please eanter 10 numbers:");
		
		while (num <= 10){
			
			System.out.println("Enter number:" + num);
			userIn = input.nextInt();
			sum = sum + userIn;
			mystr = mystr + userIn + " ";
			
			num = num + 1;
			
		}
		
		avg = sum/10;
		
		System.out.println("No. You Entered :");
		System.out.println(mystr);
		
		System.out.println("Sum of numbers : " + sum);
		System.out.println("Averegae is : " + avg);
		
	}
}