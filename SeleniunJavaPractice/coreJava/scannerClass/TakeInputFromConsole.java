package scannerClass;

import java.util.Scanner;

public class TakeInputFromConsole {

	public static void main(String[] args) {
		//If the input value is undefined only next() method we can use this case ,it take all data as a String Format.............
		
		  Scanner sc = new Scanner(System.in); System.out.println("Enter value :"); int
		  value= sc.nextInt(); System.out.println(" Value is :" + value);
		  System.out.println("Enter  Decimal value :"); double x=sc.nextDouble();
		  System.out.println("Decimal Value is :" + x);
		  System.out.println("Enter String value :"); String xy=sc.next();
		  System.out.println(" String Value is :" + xy);
		 
	}

}
