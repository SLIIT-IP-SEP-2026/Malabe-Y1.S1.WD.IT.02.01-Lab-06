// Q1

import java.util.Scanner;

public class IT26300584Lab6Q1
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Number = ");
		int num = input.nextInt();
		
		int sqNum = num * num;
		double sqrtNum = Math.sqrt(num);
		
		System.out.println();
		System.out.println("The Squre of " + num + " is " + sqNum);
		System.out.println("The Squre Root of " + num + " is " + sqrtNum);
	}
}