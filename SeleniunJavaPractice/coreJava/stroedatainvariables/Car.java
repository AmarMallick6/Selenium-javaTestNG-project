package stroedatainvariables;

public class Car {
	int wheel;
	String colour;
	String name;
	void showData()
	{
		System.out.println(name+" "+colour+"  "+wheel);
	}
	 void setData(int w,String c, String n) {
		wheel=w; 
		colour= c;
		name=n ;
	 }
	 Car(int w,String cl,String nm){
		     wheel=w; 
			colour= cl;
			name=nm ;
	 }
	

}
