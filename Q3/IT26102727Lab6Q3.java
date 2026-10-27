import java.util.Scanner;
public class  IT26102727Lab6Q3{
     public static void main(String args[]) {
	
     int number,count,square;
	 double sumofsquares,rms;
     Scanner input=new Scanner(System.in);
	 
	 System.out.print("Enter a number:");
	 number = input.nextInt();
	 count=0;
	 sumofsquares=0;
	 
	 
	 
	 while(number != -99)
	 { 
		 if(number<0 && number != -99)
		 {
			 System.out.println("invalid");
			 
		 }

			 else{
				 square=number*number;
				 sumofsquares=sumofsquares+square;
				 count++;
			 }
		 
		 System.out.print("Enter a number:");
		 number=input.nextInt();
	 }
	 if(count>0){
		 rms=Math.sqrt(sumofsquares / count);
		  System.out.print("rms:"+rms);
	 }
	}
	}