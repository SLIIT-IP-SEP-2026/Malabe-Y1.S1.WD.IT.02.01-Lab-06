import java.util.Scanner;
public class IT26101731Lab6Q2B{
    public static void main(String[] args){
	    Scanner input=new Scanner(System.in);
		
		int number=1;
		String Numbers="";
		System.out.println("Please enter 10 numbers:");
		
		while(number<=10){
			System.out.print("Enter number "+number+": ");
			int Number=input.nextInt();
			Numbers=Numbers+Number+" ";
			number++;
			}
		
		System.out.println("The numbers you entered are:");
		System.out.print(Numbers);
		}
	}