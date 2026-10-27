import java.util.Scanner;

 public class IT26102764Lab6Q3{
     
     public static void main( String[] args){
        
        // create the object
          Scanner input = new Scanner(System.in);

        // create the variables
         int num;
         int sumOfSquare = 0;
         double meanOfSquare=0, rms=0, count=0;

        // get user input
         System.out.println("Enter positive number (Terminate with -99):");
         num= input.nextInt();

        // loop
         while (num!=-99){
            if(num>0){
                count++;
                sumOfSquare= sumOfSquare+(num*num);
                System.out.println("javacEnter a positive number (Terminate with -99):");
                num=input.nextInt();
            }
            else{
                System.out.println("Inavlid Input");
            }
         }
         if (count>0){
             meanOfSquare= sumOfSquare/count;
             rms=Math.sqrt(meanOfSquare);
         }

         System.out.println("\n Root mean square(RMS) is: "+rms);    


     }
 }