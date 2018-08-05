import java.util.Scanner;

public class CTA2 {
	
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		int billOne = 0;
		int billTwo = 0;
		int billThree = 0;
		int billFour = 0;
		double monthlyAvg = 0;
		
		System.out.println("Enter week one grocery bill: ");
		billOne = scnr.nextInt();
		
		if (billOne == 50) {
			billOne = 45;
			System.out.println("You saved 10% for totaling $50, which brings your new total to: $" + billOne);
		}
		
		else if (billOne == 100) {
			billOne = 80;
			System.out.println("You saved 20% for totaling $100, which brings your new total to: $" + billOne);
		}
		else {
			System.out.println("No savings for $50 or $100 total. Week one grocery bill = $" +billOne);
		}
		
		System.out.println("Enter week two grocery bill: ");
		billTwo = scnr.nextInt();
		
		if (billTwo == 50) {
			billTwo = 45;
			System.out.println("You saved 10% for totaling $50, which brings your new total to: $" + billTwo);
		}
		
		else if (billTwo == 100) {
			billTwo = 80;
			System.out.println("You saved 20% for totaling $100, which brings your new total to: $" + billTwo);
		}
		else {
			System.out.println("No savings for $50 or $100 total. Week one grocery bill = $" + billTwo);
		}
		
		System.out.println("Enter week three grocery bill: ");
		billThree = scnr.nextInt();
		
		if (billThree == 50) {
			billThree = 45;
			System.out.println("You saved 10% for totaling $50, which brings your new total to: $" + billThree);
		}
		
		else if (billThree == 100) {
			billThree = 80;
			System.out.println("You saved 20% for totaling $100, which brings your new total to: $" + billThree);
		}
		else {
			System.out.println("No savings for $50 or $100 total. Week one grocery bill = $" + billThree);
		}
		
		System.out.println("Enter week four grocery bill: ");
		billFour = scnr.nextInt();
		
		if (billFour == 50) {
			billFour = 45;
			System.out.println("You saved 10% for totaling $50, which brings your new total to: $" + billFour);
		}
		
		else if (billFour == 100) {
			billFour = 80;
			System.out.println("You saved 20% for totaling $100, which brings your new total to: $" + billFour);
		}
		else {
			System.out.println("No savings for $50 or $100 total. Week one grocery bill = $" + billFour);
		}
		
		monthlyAvg = ((billOne + billTwo + billThree + billFour) / 4);
		
		System.out.println("Monthly grocery bill average is: $" + monthlyAvg);				
	}
}
