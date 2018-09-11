
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Automobile {    
	private static String make;
    private static String model;
    private static String color;
    private static int year;
    private static int mileage;
    private static int counter = 0;
    private static ArrayList<String> vehicleList = new ArrayList<String>(); 
    private static Scanner scan = new Scanner(System.in);
    private static final String FILENAME = "C:\\Users\\brent\\Desktop\\CSU\\Vehicle_Inventory.txt";
    
    public static void main(String[] args) {
    	userOptions();
    }
    
    public static void userOptions(){
    	int option = 0;  
    	
    	System.out.println("Vehicle Inventory Program 3000");
    	System.out.println("------------------------------");  
    	System.out.println("1. Add new vehicle");
    	System.out.println("2. Remove a vehicle");
    	System.out.println("3. Update vehicle");
    	System.out.println("4. Update file");
    	System.out.println("5. Exit Program");
    	System.out.print("Enter option 1-5 for corresponding task: ");
    	
    	option = scan.nextInt();
        
    	switch(option){
            case 1:
                addVehicle();
                break;
            case 2:
                removeVehicle();
                break;
            case 3:
                updateVehicle();
                break;
            case 4:
                printfile();
                break;
            case 5:
                exit();
                break;   
            default:
                System.out.println("Did not enter option 1 - 5; Please try again.");
                userOptions();  
                break;
        }
    }
    
    public static void exit(){
    	System.out.println("Goodbye.");
        System.exit(0);
        
    }
    
    public static void printfile(){ 
        BufferedWriter bw = null;
        FileWriter fw = null;
        
        try {      
                fw = new FileWriter(FILENAME);
                bw = new BufferedWriter(fw);
                String content = "Index Make Model Color Year Mileage\n";
                bw.write(content);
                Iterator<String> itr = vehicleList.iterator(); 
                
                while(itr.hasNext()){  
                 bw.write(itr.next().toString()+"\n");  
                }
                
                System.out.println("File Updated.");
                userOptions();
                
        } catch (IOException e) {
                e.printStackTrace();
        } finally {
                try {
                        if (bw != null)
                                bw.close();
                        if (fw != null)
                                fw.close();
                } catch (IOException ex) {
                        ex.printStackTrace();
                }
        }
    }
    
        
    public static void addVehicle(){    
    	System.out.print("Enter vehicle make:");
    	make = scan.next();
    	
    	System.out.print("Enter vehicle model:");
    	model = scan.next();
     
    	System.out.print("Enter vehicle color:");
    	color = scan.next();
    
    	System.out.print("Enter vehicle year:");
    	year = scan.nextInt();
    
    	System.out.print("Enter vehicle mileage:");
    	mileage = scan.nextInt();
    	
    	vehicleList.add(counter + " " + make + " " + model + " " + color + " " + year + " " + mileage);
    	counter++;
    	System.out.println("New vehicle added.");
        userOptions();
    }
    
    public static void updateVehicle(){
    	
    	int id = 0;
    	
    	System.out.print("Enter the index (starting at 0) of the vehicle to update:");
    	id = scan.nextInt();
    	
    	System.out.print("Enter vehicle make:");
    	make = scan.next();
    	
    	System.out.print("Enter vehicle model:");
    	model = scan.next();
    	
    	System.out.print("Enter vehicle color:");
    	color = scan.next();
    	
    	System.out.print("Enter vehicle year:");
    	year = scan.nextInt();
    	
    	System.out.print("Enter vehicle mileage:");
    	mileage = scan.nextInt();
    	
    	vehicleList.remove(id);
    	vehicleList.add(counter + " " + make + " " + model + " " + color + " " + year + " " + mileage);   
        userOptions();
    }
    
    public static void removeVehicle(){
    	System.out.print("Enter the index (starting at 0) of the vehicle to remove:");
    	int id=scan.nextInt();
    	vehicleList.remove(id);
    	System.out.println("vehicle was successfully removed");
        userOptions();
    }
}
