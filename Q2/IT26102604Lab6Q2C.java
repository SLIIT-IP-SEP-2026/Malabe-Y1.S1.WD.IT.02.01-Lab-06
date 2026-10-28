import java.util.Scanner;

public class IT26102604Lab6Q2C{
    public static void main(String[] args){
		
	    Scanner input = new Scanner(System.in);
	
	    int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, num9 = 0, num10 = 0;
	
	    System.out.println("Please enter 10 numbers:");
		
		for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            if (i == 1)
                num1 = num;
            else if (i == 2)
                num2 = num;
            else if (i == 3)
                num3 = num;
            else if (i == 4)
                num4 = num;
            else if (i == 5)
                num5 = num;
            else if (i == 6)
                num6 = num;
            else if (i == 7)
                num7 = num;
            else if (i == 8)
                num8 = num;
            else if (i == 9)
                num9 = num;
            else
                num10 = num;
        }
		
	    System.out.println("The numbers you entered are:");
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " " + num7 + " " + num8 + " " + num9 + " " + num10);
		
		int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;

        double average = sum / 10.0;

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}