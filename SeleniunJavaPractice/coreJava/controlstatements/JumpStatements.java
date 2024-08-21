package controlstatements;

public class JumpStatements {

	public static void main(String[] args) {
		/*
		 * In java two Jumping statements are available (break and continue)
		 */
  //Break >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		for (int i = 0; i <=7; i++) {
			if (i==5) {
				break;
			}
			System.out.println(i);   //output is - 01234
			
		}
	//Continue >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				for (int i = 0; i <=7; i++) {
					if (i==1 || i==3 || i==5 || i==7) {
						continue;
						
					}
					
					System.out.println(i);   //output is - 0246
				}
	}

}
