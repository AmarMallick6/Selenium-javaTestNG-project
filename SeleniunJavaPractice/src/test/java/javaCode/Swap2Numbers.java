package javaCode;

public class Swap2Numbers {

	public static void main(String[] args) {
		int x=5,y=10;
		System.out.println("Before Swapping values are x : "+ x +" and y :"+y);

//Logic-1(Using 3rd Variable )......................................................................................................
/*		int temp=x;
		x=y;
		y=temp;
	System.out.println("After Swapping values are x : "+ x +" and y : "+y);   */
//Logic-2(Using single Line Statements)....................................................................................................
	/*	y=x+y-(x=y);
		System.out.println("After Swapping values are x : "+ x +" and y : "+y);   */
//Logic-3(Using + &- OPerators )...........................................................................................................
/*		x=x+y;
		y=x-y;
		x=x-y;W
		System.out.println("After Swapping values are x : "+ x +" and y : "+y);  */
//Logic-4(Using * & / OPerators )...........(Where Both x &  y values are not zero,we can use this Methods)..........................................................
	/*			x=x*y ; // 5*10=50
				y=x/y;  //50/10=5
				x=x/y;  //50/5=10
				System.out.println("After Swapping values are x : "+ x +" and y : "+y);	 */
//Logic -5(Using BitwiseXOR and ^ Operators)..........................................................................
	// In this Methods Bitwise XOR Operators convert numbers in to Binary code  First & then Functioning it.....
		x=x^y;   // 15
		y=x^y;   // 5
		x=x^y;   //  10
		System.out.println("After Swapping values are x : "+ x +" and y : "+y);
	}

}
