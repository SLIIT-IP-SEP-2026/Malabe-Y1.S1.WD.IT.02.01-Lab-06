import java.util.Scanner;
public class IT26102599Lab6Q2B{
	public static void main(String[] args){
	int count,num;
	Scanner input=new Scanner(System.in);
	
	count=1;
	num=0;
	
	while(count<=10)
	{
		System.out.print("Enter number");
		num=input.nextInt();
		
		System.out.println(num);
	    count++;
	}
	
}
}