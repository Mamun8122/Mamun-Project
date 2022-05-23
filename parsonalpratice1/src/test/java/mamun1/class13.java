package mamun1;

import java.util.ArrayList;
import java.util.HashMap;

public class class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 String [] frouts={"Mango","Banana","jamon","Cantalop","Watermilon"};
		for (int i=0; i<frouts.length; i=i+1)
		System.out.println(frouts[i]);
		
		int [] numbers= {2,3,4,5,6};
		
		
		String [] car= {"Honda","Hondai","nisan","froad"};
		for (int j=0;j<car.length; j=j+1)
			System.out.println(car[j]);
		
		car [1]= "tasla";
		
		System.out.println(car [1]);
		for (int j=0;j<car.length; j=j+1)
			System.out.println(car[j]);	
		System.out.println(car.length);
		
		
		ArrayList <String> country= new ArrayList <String>();
		
		country.add("Babgladesh");
		country.add("pakistin");
		country.add("Soudi Aribe");
		country.add("kater");
		
		country.set(3,"irak");
		for (int i=0; i<country.size(); i=i+1)
			System.out.println(country.get(i));
		
		country.get(1);
		System.out.println(country.get(1));
		country.clear();
		System.out.println(country.size());
		
		
		HashMap <String,String> address=new HashMap <String,String> ();
		
		address.put ("Savr","Dhaka");
		address.put ("kutbari","cumilla");
		address.put ("Dhanmondi","Dhaka");
		address.put ("islamabad","pakistan");

		 
		for (String i : address.keySet())
			System.out.println("key "+i+ ","+" value "+address.get(i));
		
		address.get("Savr");
		System.out.println(address.get("Savr"));
		
		address.remove("Savr");
		System.out.println(address.remove("Savr"));
		
		System.out.println(address.size());
		address.clear();
		*/
		
		ArrayList<String> Country = new ArrayList<String>();

		Country.add("Bangladesh");
		Country.add("Pakistan");
		Country.add("Iran");
		Country.add("USA");



		Country.remove(0);
		System.out.println(Country.remove(0));

		for (int i=0; i< Country.size(); i=i+1)
		System.out.println(Country.get(i));
	}

}
