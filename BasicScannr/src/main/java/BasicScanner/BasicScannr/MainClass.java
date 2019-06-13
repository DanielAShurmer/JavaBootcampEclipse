package BasicScanner.BasicScannr;

import java.util.Scanner;
class MainClass{
	public static void main(String args[]){  
		Scanner input = new Scanner(System.in);   
		System.out.println("Enter your name:");          
		String name=input.nextLine();//It is used to get the input string.    
		System.out.println("Hello "+name);        
		
		System.out.println("-----------------------------------------");   
		
		System.out.print("Enter First Number:");          
		int no1=input.nextInt(); // It scans for int values from the key board          
		System.out.print("Enter Second Number:");           
		int no2=input.nextInt(); // It scans for int values from the key board        
		int result=no1+no2;              
		System.out.println("The Reult is "+ result);           
		
		System.out.println("-----------------------------------------"); 
		
		System.out.print("Enter Price:");         
		float price=input.nextFloat();            
		System.out.print("Enter Quantity:");          
		int quantity=input.nextInt();         
		float amount=price*quantity;         
		System.out.println("Total Amount is:"+amount);
		
		input.close();
	}
}