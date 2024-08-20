package operators;

public class JavaOperators {

	public static void main(String[] args) {
	//Arithmetic Operators are ::---  ( +,   -  ,  * ,  /,    %)
		short a=100,b=20;
		System.out.println(a+b); //120
		System.out.println(a-b); //80
		System.out.println(a*b);  //2000
		System.out.println(a/b);  //5
		System.out.println(a%b);  //0
		
	//Relational/comparisonal Operators are ::---  ( ==,   != ,  < ,  >,   <= , >= )
		short x=10,y=20,z=10;
		System.out.println(x==z);   //true
		System.out.println(x!=z);    //false
		System.out.println(x<y);       //true
		System.out.println(x>y);       //false
		System.out.println(x<=y);       //true
		System.out.println(x>=y);       //false
		
	// Assignment  Operators are ::---  ( =,  + = ,  -= ,  *=,   /= , %= )
		int c= 5;
		System.out.println(c=c+2); //or we can write  c+=2 , Answer=7
		System.out.println(c=c-2);  //or we can write  c-=2 , Answer=5
		System.out.println(c=c*2);  //or we can write  c*=2 , Answer=10
		System.out.println(c=c/2);  //or we can write  c/=2 , Answer=5
		System.out.println(c=c%2); //or we can write  c%=2 , Answer=1
		
	// Logical  Operators are ::---  (&& ,  || , ! )
		boolean m=true,n=false;
	//It is used two compare between Boolean type of value......................
		System.out.println(m&&n); //False
		System.out.println(m||n); //True
		System.out.println(!m); //False
		System.out.println(!n); //True
		System.out.println((2>1)&&(1<2)); //True
		
		
	// Increment & Decrement  Operators are ::---  (++,  -- )
		
	/*Further it divided into two groups such as - post Increment/Decrement and pre  Increment/Decrement
	 In post  Increment/Decrement it will 1st assign the value then start 	Increment/Decrement but, 
	 In pre Increment/Decrement it will 1st Increment/Decrement value then assigned . 
	*/	
		//case-01
		int s=10;
		s++;  //s=s+1;
		System.out.println(s); //11
	
		int q=1;
	/*	int d=q++;   //post Increment
	  System.out.println(d); //1
	  System.out.println(q); //2
	   */
		
	/*	int d =++q;   //pre increment
	 System.out.println(d); //2
	  System.out.println(q); //2
	  */
		
	/*
	 * int d=q--;//post decrement 
	 * System.out.println(d); //1 
	 * System.out.println(q); //0
	  */		  
		int d =--q;   //pre increment
	     System.out.println(d); //0
		  System.out.println(q); //0
		  
		
		
	  
	}

}
