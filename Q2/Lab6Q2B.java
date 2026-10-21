import java.util.Scanner;
 public class Lab6Q2B{
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.println("Please enter 10 numbers");
  
  int num = 1;
  String enteredNums =  "";
  while (num <= 10)
  { System.out.print ("Enter number " + num +":"); 
    int count = input.nextInt();
	
    enteredNums = enteredNums + count + " ";
	num++;
  }
  
  System.out.println("The numbers you entered are : " + enteredNums);
  
 }
}