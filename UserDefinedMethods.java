// Project Purpose: Develop program that prompts user for three string values and returns a singlue reversed/concatenated string

import java.util.Scanner;

public class CTA5 {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String paraA = "";
		String paraB = "";
		String paraC = "";
		
		String finalString = "";
		
		System.out.println("Enter first string: ");
		paraA = scnr.nextLine();
		
		System.out.println("Enter second string: ");
		paraB = scnr.nextLine();
		
		System.out.println("Enter third string: ");
		paraC = scnr.nextLine();
		
		finalString = reversedConcat(paraA, paraB, paraC);
		System.out.println("Reversed concatenated string is: " + finalString);	
		
	}
	
	public static String reversedConcat(String paraA, String paraB, String paraC) {
		
		String concatString = "";
		String reversedString = "";
		
		concatString = paraA + paraB + paraC;
		
		for (int i = concatString.length() - 1; i >= 0; --i) {
			reversedString += concatString.charAt(i);
		}
		return reversedString;
		
	}
}
