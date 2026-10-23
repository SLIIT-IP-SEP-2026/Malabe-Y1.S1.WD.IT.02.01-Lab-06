import java.util.Scanner;
public class IT26510428Lab6Q3{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=input.nextInt();
		int sum=0;
		int count=0;
		while (num!=-99){
			if (num<0){
				System.out.println("Please enter a positive integer or -99 to terminate");
			}
			else
			{
				int sqrt=num*num;
				sum=sum+sqrt;
				count+=1;
			}
				System.out.println("Enter a number: ");
				num=input.nextInt();
			}
		double rms=Math.sqrt(sum/count);
		System.out.println("The Root Mean Square (RMS) :"+rms);
	}
}
	
		
			