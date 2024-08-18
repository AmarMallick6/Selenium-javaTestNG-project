package javaCode;

public class CountCharacterOccurenceInString {

	public static void main(String[] args) {
		String x = "Amar Kumar Mallick";
		int Total_Char=x.length();
		System.out.println("Total Length of Characters in String :"+Total_Char); //18
		  int AftrReplace = x.replaceAll("r", "").length();
		  int AftrReplace2 = x.replaceAll("a", "").length();
		  System.out.println("Total Length of Characters in String  After Replace:"+ AftrReplace); //16
		  System.out.println("Total Length of Characters in String  After Replace:"+ AftrReplace2);  //15
		  int Accurance=Total_Char-AftrReplace;
		  System.out.println(Accurance);   //2
		  System.out.println(Total_Char-AftrReplace2); //3

	}

}
