package stroedatainvariables;

public class CarMain {

	public static void main(String[] args) {
		// (Approach-01)Store value using object Reference
		/*
		 * Car c = new Car(); c.colour="Red"; 
		 * c.name="TATA"; 
		 * c.wheel=4;
		 *  c.showData();
		 */
       
   	// (Approach-02)   Using Method>>>>>>>>>
	/*
	 * c.setData(3,"Black" ,"Honda");
	 *  c.showData();
	 */
	//Due to approach -3 use a parameter constructor above 2 approaches are commented
   	// (Approach-03)   Using Constructors>>>>>>>>>
       Car c1= new Car(2, "Blue", "Hero");
          c1.showData();
	}

}
