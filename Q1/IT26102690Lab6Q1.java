import java.util.Scanner ;
public class IT26102690Lab6Q1{
	public static void main (String[] args){
		double UserIN,sq,sqr;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number :");
		UserIN = input.nextDouble();
		
		sq = UserIN * UserIN;
		sqr = Math.sqrt(UserIN);
		
		System.out.println("The Square of " + UserIN + " is: " + sq);
		System.out.println("The SquareRoot of " + UserIN +" is: " + sqr);
		
		
	}
}