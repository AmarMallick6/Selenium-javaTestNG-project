package controlstatements;

public class SwitchCase {

	public static void main(String[] args) {
	//	Example-01..........................................
	int mnth_no=3;
	switch (mnth_no) {
	case 1: System.out.println("JANUARY");	break;	
	case 2: System.out.println("FEBRUARY");	break;	
	case 3: System.out.println("MARCH");	break;
	case 4: System.out.println("APRIL");	break;
	case 5: System.out.println("MAY");	break;
	case 6: System.out.println("JUNE");	break;
	default:System.out.println("Month is not available in this list");
		
	}
//	Example-02..........................................
	String mnth_name="MARCH";
	switch (mnth_name) {
	case "DECEMBER": System.out.println(12);	break;
	case "NOVEMBER": System.out.println(11);	break;	
	case "OCTOBER": System.out.println(10);	break;
	case  "SEPTEMBER": System.out.println(9);	break;
	default:System.out.println("Month & number is not available in this list");
		
	}

	}

}
