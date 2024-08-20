package operators;

import org.apache.poi.ss.formula.DataValidationEvaluator.OperatorEnum;

public class TernaryOperator {

	public static void main(String[] args) {
	/*In Ternary Operator 1st it check the Expression if expression is True it will be return Condition 1 as Result .
                        If Expression is False it will be return Condition 2 as Result.
   syntax >> variable=expressions? condition1:condition2;
   */
		
		//Example-01>>>>>>>
		int boy_age=28;
       String  x = (boy_age>=18)?"Adult":"child";
       System.out.println(x);
       
    //Example-02>>>>>>>
      int a=100,b=20;
       int  c =(a>b)? a:b;
     System.out.println(c);  
     int  cm =(false)?100:20; 
     System.out.println(cm);  
	}

}
