import java.util.Scanner;
public class IT26102595Lab6Q2C{
  public static void main(String[] args)
  {
    int count = 1;
	int num;
	String numbers = " ";
	double sum = 0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("please enter 10 numbers :");
	
	while(count <= 10)
	{
		System.out.print("Enter number"+ count +":");
		 num = input.nextInt();
		 count++;
		 numbers = numbers + num + " ";
	     sum += num;
	}
	 System.out.println();
	 System.out.println("the numbers you entered are: "+ numbers);
	 
	  double avg = sum/count;
	  
	 System.out.println();
	 System.out.println("sum of the numbers : " + sum);
	 System.out.println("average of the numbers : " +avg);
	 
   

  }
} 