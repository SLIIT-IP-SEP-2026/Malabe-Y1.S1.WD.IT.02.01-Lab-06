import java.util.Scanner;
public class IT26102599Lab6Q2C{
	public static void main(String[] args){
	int count,num,sum;
	double Average;
	Scanner input=new Scanner(System.in);
	
	count=1;
	num=0;
	sum=0;
	
	while(count<=10)
	{
		System.out.print("Enter number");
		num=input.nextInt();
		
		System.out.println(num);
		sum=sum+num;
	    count++;
	}
	
	Average=sum/10.0;
	System.out.println("sum"+sum);
	System.out.println("Average"+Average);
}
}