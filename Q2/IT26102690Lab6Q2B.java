import java.util.Scanner ;
public class IT26102690Lab6Q2B{
	public static void main (String[] args){
		int num,userIn;
		String mystr = "";
		num = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Please eanter 10 numbers:");
		
		while (num <= 10){
			
			System.out.println("Enter number:" + num);
			userIn = input.nextInt();
			mystr = mystr + userIn + " ";
			
			
			num = num + 1;
			
		}
		
		
		System.out.println("No. You Entered :");
		System.out.println(mystr);
	}
}