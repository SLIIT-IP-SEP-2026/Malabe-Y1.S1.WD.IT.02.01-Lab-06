import java.util.Scanner;
public class IT26101731Lab6Q2C{
    public static void main(String[] args){
	    Scanner input=new Scanner(System.in);
		
		int number=1;
		int sum=0;
		int count=0;
		double avg;
		String Numbers="";
		System.out.println("Please enter 10 numbers:");
		
		while(number<=10){
			System.out.print("Enter number "+number+": ");
			int Number=input.nextInt();
			    if(Number<0){
					System.out.println("Enter a positive number.");
					continue;
				}
			Numbers=Numbers+Number+" ";
			sum=sum+Number;
			count++;
			number++;
			}
		avg=sum/count;
		System.out.println();
		System.out.println("The numbers you entered are:");
		System.out.print(Numbers);
		System.out.println();
		System.out.println("Sum of the numbers: "+sum);
		System.out.println("average of the numbers: "+avg);
		}
	}