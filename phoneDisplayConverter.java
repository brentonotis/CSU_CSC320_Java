// Little program I created illustrating example of user-defined methods

import java.util.Scanner;

public class Example1 {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String userInput = "";
		String properFormat = "";
		
		System.out.println("Enter phone number (i.e.: 3334445567): ");
		userInput = scnr.nextLine();
		
		while (userInput.length() != 10) {
			System.out.println("Did not enter 10 characters. Please enter 10 characters: ");
			userInput = scnr.nextLine();
		}
		
		properFormat = formatNumber(userInput);
		
		System.out.println("Common phone number display: " + properFormat);	
	}
	
	public static String formatNumber(String userInput) {
		
		String numFormat = String.format("(%s) %s-%s", userInput.substring(0,3), userInput.substring(3,6), userInput.substring(6,10));
		
		return numFormat;
	}
}
