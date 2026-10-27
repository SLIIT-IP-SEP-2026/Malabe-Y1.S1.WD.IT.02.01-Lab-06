import java.util.Scanner;
public class IT26102778Lab6Q2b{
    public static void main(String[] args){
	    Scanner input=new Scanner(System.in);
		
		int number=1;
		String Number="";
		System.out.println("Please enter 10 numbers:");
		
		while(number<=10){
			System.out.print("Enter number "+number+": ");
			int Num=input.nextInt();
			Number=Number+Num+" ";
			number++;
			}
		
		System.out.println("The numbers you entered are:");
		System.out.print(Number);
		}
	}

	