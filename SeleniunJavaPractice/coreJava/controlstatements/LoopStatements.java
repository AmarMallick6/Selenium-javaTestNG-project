/**
 * 
 */
package controlstatements;

/**
 * @author MAK
 * Loop Statements are :: While loop,do-while loop,For loop & For each or enhance For loop
 * While loop :- First check conditions if true then execute the statements.
 *do- While loop :-  check conditions if true then execute the statements otherwise only run single time in side the do statements.
 */
public class LoopStatements {

	
	public static void main(String[] args) {
//While loop Example >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		short m=7;
		while (m<13) {
			System.out.println(m);  //result=7
			break;
		}
// do-While loop Example >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				short x=17;
				do {
					System.out.println(x);  // result=17
					break;
			    	}	while (x<13) ;
	// For loop Example >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
	//Print Value between 5 to 10.............................	
		for (int i = 5; i <= 10; i++) {
			System.out.println(i);                //result=5,6,7,8,9,10
		}
	// For each- loop Example >>>> >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		  int c[] = {5,3,2,4,8};
		  for (int i : c) {
			System.out.println(i);
		}
	}

}
