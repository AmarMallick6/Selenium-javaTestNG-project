package array_Arraylist;

import java.util.Iterator;

public class TwoDimesionalArray {

	public static void main(String[] args) {
	//Declaring Array  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
         int x[] []=new int [2][2];     //Approach-01(Where data size is Fixed and not to added Further)
    //Add value in Array......................................
         x[0][0]=10;
         x[0][1]=20;
         x[1][0]=30;
         x[1][1]=40;
   //print the length of Array Rows...........................................
 		System.out.println("Size of Array is :"+ x .length);
  //print the length of Array Columns...........................................
 		System.out.println("Size of Column is :"+ x[0] .length);
 //print all value of an array using For Each Loop............................................................
	/*
	 * for (int data[] : x) { for (int z : data) { System.out.print(z+"\t"); }
	 * System.out.println(); }
	 */
 		
 	 //print all value of an array using Each Loop............................................................
 	for (int r = 0; r< x.length; r++) {
 		for (int c = 0; c < x[r].length; c++) {
			   System.out.print(x[r][c]+"\t");
		}
 		   System.out.println();
		
	}
	}

}
