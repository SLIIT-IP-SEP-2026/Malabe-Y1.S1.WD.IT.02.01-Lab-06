import java.util.Scanner;
public class IT26102670Lab6Q3
{
	public static void main(String[] args)
	{
		int num = 0;
		int sumOfSqNum = 0;
		int sqNum;
		int count = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive intergers (terminate input with -99):");
		
		System.out.print("Enter a number :");
		num = input.nextInt();
		
		while (num != -99)
		{
			if (num > 0)
			{
				System.out.print("Enter a number :");
				 num = input.nextInt();
				
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
		double  rootMeanSquare = Math.sqrt(sumOfSqNum/count);
		
		
			System.out.println();
			System.out.println("The Root Squre (RMS) is : " + rootMeanSquare);
	}
}
		