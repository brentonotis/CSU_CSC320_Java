import java.util.Arrays;
import java.util.Scanner;

public class CTA4 {
    
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);  
        
        double[] array = new double[5];
        double sum = 0.0;    
 
        for (int i = 0; i < array.length; ++i) {
        	System.out.println("Enter a floating point value: ");
            array[i] = scnr.nextDouble();
            sum += array[i];
        }
        
        Arrays.sort(array);
        
        System.out.println("Min value: " + array[0]);
        System.out.println("Max value: " + array[array.length - 1]);
        System.out.println("Avg value: " + (sum / 5));       
    }
}
