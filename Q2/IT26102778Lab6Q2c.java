import java.util.Scanner;
public class IT26102778Lab6Q2c{
    public static void main(String[] args){
	    Scanner input=new Scanner(System.in);
		
		int number=1;
		String Number="";
		int Sum=0;
		double Average=0;
		System.out.println("Please enter 10 numbers:");
		
		while(number<=10){
			System.out.print("Enter number "+number+": ");
			int Num=input.nextInt();
			Number=Number+Num+" ";
			Sum=Sum+Num;
			number++;
			}
		
		System.out.println("The numbers you entered are:");
		System.out.print(Number);
		
		System.out.println("\n");
		
		System.out.println("Sum of the number: "+Sum);
		Average=Sum/10;
		System.out.println("Average of the numbers: "+Average);
		}
	}

	