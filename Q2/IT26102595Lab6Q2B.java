import java.util.Scanner;
public class IT26102595Lab6Q2B{
  public static void main(String[] args)
  {
    int count = 1;
	int num;
	String numbers = " ";
	 
	Scanner input = new Scanner(System.in);
	
	System.out.println("please enter 10 numbers :");
	
	while(count <= 10)
	{
		System.out.print("Enter number"+ count +":");
		 num = input.nextInt();
		 count++;
		 numbers = numbers + num + " ";
	
	}
	 System.out.println("the numbers you entered are: "+ numbers);
   

  }
}