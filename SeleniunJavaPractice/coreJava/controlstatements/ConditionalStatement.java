package controlstatements;

/*@author MAK
* ConditionalStatements:-According Conditions we Executes Some Code/Statements.
* Types of ConditionalStatements:- (1)If (2)If else (3) NestedIf else(4)switchcase statements
*/
public class ConditionalStatement {

	public static void main(String[] args) {
	//IF Conditions(If Conditions true ,Execute inside the Statements/code )
		short mark=45;
		if (mark>30) {
			System.out.println("Passed");
		}
//IF  Else Conditions(If Conditions true ,Execute inside the IF Statements/code .If Conditions Fail ,Execute inside the Else Statements/code )
		short number=25;
		if (number>30) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
//Nested IF  Else Conditions(If Conditions true ,check  inside the IF Statements and both are true ,Execute inside the If Statements/code )
		
		short x=55;
		if (x > 30) {
			if (x == 30) {
				System.out.println("X is 30");
			} else {
				System.out.println("X is bigger than 30");
			}
		} else {
			System.out.println("X is smaller than 30");
		}
//// IF  Else-if  Conditions	...................................
		short a,b;
		a=100;
		b=150;
		if (a>b) {
			System.out.println("A is Big");
		}else if (a<b) {
			System.out.println("B is Big");
		}else {
			System.out.println("Both are Same");
		}
		
		
		
	}

}
