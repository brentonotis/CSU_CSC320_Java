// Program purpose: Prompt user to enter day of week and corresponding temperature; Store in multiple arrays; Return Daily values as well as average

import java.util.Scanner;

public class Example1 {
    
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
              
        int[] dayTemp = new int[7];
        String[] dayWeek =  new String[7];
        int sum = 0;
        int avg;
        
        for (int i = 0; i < dayTemp.length; ++i) {
        	System.out.println("Please enter a day of the week: ");
        	dayWeek[i] = scnr.next();
        	
        	System.out.println("Please enter the temperature on that day: ");
        	dayTemp[i] = scnr.nextInt();
        	
        	sum += dayTemp[i];
        }
        avg = sum/7;
        
        System.out.println("Daily Temperatures");
        System.out.println("------------------");
        
        for (int i = 0; i < dayTemp.length; ++i) {
        	System.out.println(dayWeek[i] + ": " + dayTemp[i]);
        }
        
        System.out.println("------------------");
        System.out.println("Avg Temperature: " + avg);
        
    }	   
}

