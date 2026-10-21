import java.util.Scanner;
public class IT26102670Lab6Q2B
{
	public static void main(String[] args)
	{
		Scanner nim = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
		
		int num = 1;
		while (num <= 10)
		{
			System.out.print("Enter number " + num + " : ");
			double number = nim.nextDouble();
			num++;
			
		}
	}
}