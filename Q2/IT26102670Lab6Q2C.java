import java.util.Scanner;
public class IT26102670Lab6Q2C
{
	public static void main(String[] args)
	{
		int num;
		int count = 1;
		String numbers = " ";
		double sum = 0;
		
		Scanner nim = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
		
		while (count <= 10)
		{
			System.out.print("Enter number " + count + ":");
			num = nim.nextInt();
			count++;
			numbers = numbers + num + " ";
			sum += num;
		}
		
		double avg = sum/count;
		
		System.out.println();
		System.out.println("Sum of the numbers:" + sum);
		System.out.println("Average of the numbers:" + avg);
	}
}
		
	
		