package projectjava;

import java.util.ArrayList;

public class Lec3Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Sportscars = new ArrayList<String>();
		Sportscars.add("Honda");
		Sportscars.add("Nissan");
		Sportscars.add("Toyata");
		Sportscars.add("Ford");
		System.out.println(Sportscars);
		
		ArrayList<String> Country = new ArrayList<String>();
		Country.add("Bangladesh");
		Country.add("Pakistan");
		Country.add("Iran");
		Country.add("USA");
		System.out.println(Country);
		
		
		Country.get(1);
		System.out.println(Country.get(1));
		
	//	Country.set(3,"Uk");
		
	//	Country.remove(2);
		
		
		
	}

}
