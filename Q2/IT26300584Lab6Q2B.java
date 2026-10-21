// Q2B

import java.util.Scanner;

public class IT26300584Lab6Q2B
{
	public static void main(String[]args)
	{
		int count = 1;
		int num;
		String numbers = " ";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers : ");
		
		while(count <= 10)
		{
			System.out.print("Enter number " + count + " : ");
			num = in.nextInt();
			count++;
			numbers = numbers + num + " ";
		}
		
		System.out.println("The numbers you entered are: " + numbers);
	}
}
		