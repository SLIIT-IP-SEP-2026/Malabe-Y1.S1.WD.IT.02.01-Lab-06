import java.util.Scanner;
  
  public class IT26102764Lab6Q2A{
   
   public static void main( String[] args){
     
	// declare the variables
	  int num;
	  
	// declare and initialise the variable 
	  num = 1;
	  
	// while loop
	 while (num <= 10){
	     if (num == 5){
		        num = num + 1;
			    continue;
			}
			System.out.println(num);
			num = num + 1;
		}
	}
}
	  