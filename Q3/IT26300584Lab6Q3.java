// Q3

import java.util.Scanner;

public class IT26300584Lab6Q3
{
	public static void main(String[]args)
	{
		int num = 0;
		int sumOfSqNum = 0;
		int sqNum;
		int count = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive integers (terminate input with -99): ");
		
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		while (num != -99)
		{
			if (num > 0)
			{
				System.out.print("Enter a number : ");
				num = sc.nextInt();
				
				sqNum = num * num;
				sumOfSqNum += sqNum;
				
				count++;
			}
			else
			{
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
				break;
			}
		}
			double rootMeanSquare = Math.sqrt(sumOfSqNum/count);
			
			System.out.println();
			System.out.println("The Root Mean Squre (RMS) is : " + rootMeanSquare);
	}
}

				
		