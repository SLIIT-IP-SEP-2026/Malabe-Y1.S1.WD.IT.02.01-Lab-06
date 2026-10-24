import java.util.Scanner;
public class IT26101506Lab6Q3{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int number;
		int sumOfSquare=0;
		double meanOfSquare,rms=0,count=0;
		
		System.out.println("Enter positive number(Terminate with -99): ");
		
		System.out.print("Enter positive number: ");
		number =input.nextInt();
		
		while(number !=-99){
			if(number > 0){
				count++;
				sumOfSquare = sumOfSquare+(number * number);
				System.out.print("Enter positive number: ");
				number =input.nextInt();
			}
			else
			{
				System.out.println("Invalid input");
				break;
			}
		}
		if(count > 0){
			
			meanOfSquare=sumOfSquare/count;
			rms = Math.sqrt(meanOfSquare);
			
		}
		System.out.println("Root mean Square"+rms);
	}
}