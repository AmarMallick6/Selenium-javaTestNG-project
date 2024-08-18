package javaCode;

public class RemoveJunkCharFromString {

	public static void main(String[] args) {
		String s = "Amar !@#$#%%@Kumar*&&%^Mall(*&&ick";
		String s1="A  m  @ a % r ";
	     String sm = s.replaceAll("[^A-Za-z0-9]", "");
	     String sms = s1.replaceAll("[^A-Za-z]", "");
          System.out.println(sm);  //AmarKumarMallick
          System.out.println(sms);  //Amar
	}

}
