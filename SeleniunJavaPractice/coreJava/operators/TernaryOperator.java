package operators;

public class TernaryOperator {

	public static void main(String[] args) {
	//syntax >> variable=expressions? condition1:condition2;
		//Example-01>>>>>>>
		int boy_age=28;
       String  x = (boy_age>=18)?"Adult":"child";
       System.out.println(x);
       
    //Example-02>>>>>>>
      int a=100,b=20;
       int  c =(a>b)? a:b;
     System.out.println(c);  
     int  cm =(false)?10:20; 
     System.out.println(cm);  
	}

}
