package mamun1;

import java.util.HashMap;

public class class134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Double,String> student=new HashMap <Double,String> ();
		
		
		student.put(1.0,"Mamun");
		student.put(2.0,"khan");
		student.put(3.0,"abdull");
		student.put(3.0,"al");
		
		for (Double i : student.keySet())
			System.out.println("key "+i+", "+"Value "+student.get(i));
		
		
		for (Double i : student.keySet())
			System.out.println(i);
		

			System.out.println(student.get(3.0));
	}

}
