import java.util.Scanner;
public class IT26102595Lab6Q3{
  public static void main(String[] args)
  {
    int num = 0;
	int sumofsqNum = 0;
	int sqNum;
	int count = 1;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a positive integers (terminate input with -99):");
	
	System.out.print("Enter a number : ");
	num = input.nextInt();
	
	while(num != -99)
	{
		if (num > 0 )
		{	
		 System.out.print("Enter number:");
		 num = input.nextInt();
		 
		 sqNum = num * num;
		 sumofsqNum += sqNum;
		  
		 count++;
		}
		else
		{ 
          System.out.println("invalid input.please enter a positive integer or -99 to terminate");
		  break;
		} 
	}
	 
	  double rootmeansquare = Math.sqrt(sumofsqNum/count);
	  
	 System.out.println();
	 System.out.println("the root mean squre (RMS) is : " + rootmeansquare) ;
	 
	 
   

  }
} 