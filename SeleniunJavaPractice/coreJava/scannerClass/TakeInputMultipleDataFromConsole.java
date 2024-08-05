package scannerClass;

import java.util.Arrays;
import java.util.Scanner;

public class TakeInputMultipleDataFromConsole {
 
	public static void main(String[] args) {
	int x[]=new int[4];
	Scanner sc = new Scanner(System.in);    //Taking input from console in runtime
	for (int i = 0; i < x.length; i++) {
		  System.out.println("Enter value in position "+i+":");
		      x[i] = sc.nextInt();
	}
	System.out.println(Arrays.toString(x));
	}

}
