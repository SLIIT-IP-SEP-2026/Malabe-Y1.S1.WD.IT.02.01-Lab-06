import java.util.Scanner;
public class IT26101820Lab6Q2C{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 10 numbers:");
		int num,count,sum;
		String numbers="";
		count=1;
		double avg;
		sum=0;
		while (count<=10){
			System.out.print("Enter number "+count+":");
			num=input.nextInt();
			numbers=numbers+num+" ";
			count++;
			sum=sum+num;
			
		} 
		avg=sum/10.0;
		
		System.out.println();
		System.out.println("The numbers you entered are: ");
		System.out.println(numbers);
		System.out.println();
		System.out.println("Sum of the numbers:"+sum);
		System.out.println("Average of the numbers:"+avg);
		
		
	} 
}