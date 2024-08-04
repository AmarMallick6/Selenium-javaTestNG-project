/**
 * 
 */
package array_Arraylist;



/**
 * syntax of Declaration of Array>>>>>>>>>>>>>>>>>>>>
		DataType Variable []=new DataType[size of Array]; //Approach -01
		DataType variable[]={ if Size is not known or not fixed};  //Approach-02
 * 
 */
public class SingleDimensionalArray {
	
	public static void main(String[] args) {
		
//Approach-01...>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		int a[]=new int[3];
//Add value in Array and print it..............................
		System.out.println(a[0]=15);
		System.out.println(a[1]=25);
		System.out.println(a[2]=35);
//print the length of Array...........................................
		System.out.println("Length of Array is :"+ a .length);
  //Update value in specific index...........................................
		a[0]=50;
		System.out.println("After update 1st index value is :"+ a[0]);
//print all data using loop condition................................................
		for (int arrayvalue : a) {
			System.out.println(arrayvalue);
		}
		
//Approach-02...>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				int b[]= { 25,30,40,75};
 //print the length of Array...........................................
			System.out.println("Length of Array is :"+ b .length);
  //Update value in specific index...........................................
				b[0]=500;
				System.out.println("After update 1st index value is :"+ b[0]);
//print all data using loop condition................................................
				for (int arrayvalue : b) {
					System.out.println(arrayvalue);
				}
				
	}

}
