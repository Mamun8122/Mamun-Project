package projectjava;

public class Lec5accessmodifiermethods {
     
	
	// diffult attribute
	int a=10;
	
	String car="Nissan";
	
	
	
	
	// syntax of method
	// accessmodifier returntype methood name (){}
	
	public void facebooklogin() {
		
		//body of code
		
	}
	
	public void facebooksignup() {
		
		//body of code
		
	}
	
	private void methodP() {
		
		//body of code
		
	}
	
	//default method
	void methodd() {
		
		//body of code
		
	} 
	public static void main(String[] args) {
		// Create object of the class (SYNTEX)
		// class name    object name of the class = new class name (); 
		
		Lec5accessmodifiermethods accessmodifier = new Lec5accessmodifiermethods ();
		System.out.println(accessmodifier.car);
		
		accessmodifier.methodP();
		
		//changing the value from 10 to 100
		accessmodifier.a=100;
		System.out.println(accessmodifier.a=100);
		
	}

}
