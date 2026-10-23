import java.util.Scanner;
public class IT26510428Lab6Q2B{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 10 numbers:");
		int num,count;
		String numbers="";
		count=1;
		while (count<=10){
			System.out.println("Enter number "+count+":");
			num=input.nextInt();
			numbers=numbers+num+" ";
			count+=1;
			
		}
		System.out.println("The numbers you entered are: ");
		System.out.println(numbers);
	}
}
			
		