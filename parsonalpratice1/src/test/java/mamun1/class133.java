package mamun1;

import java.util.ArrayList;

public class class133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>car=new ArrayList<String>();
		
		car.add("Honda");
		car.add("Tasla");
		car.add("Nisan");
		car.add("Hondai");
		car.set(3,"ABC");
		car.remove(2);
		car.clear();
		
		for (int i=0; i<car.size(); i=i+1)
			System.out.println(car.get(i));

	}

}
