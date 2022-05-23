package Mamunpackage2;

import java.util.HashMap;

public class Class132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> student=new HashMap <Integer,String> ();
		
		student.put(1,"Mamun");
		student.put(2,"ALam");
		student.put(3,"Mina");
		student.put(4,"Karim");
		/*
		for (Integer i : student.keySet())
			System.out.println("key "+i+ ","+" value "+student.get(i));
		
		for (Integer i : student.keySet())
			System.out.println(i);
		for (Integer i : student.keySet())
			System.out.println(student.get(i));
		
		
		student.remove(2);
		
		for (Integer i : student.keySet())
			System.out.println("key "+i+ ","+" value "+student.get(i));
		*/
		student.get(1);
		System.out.println(student.get(1));
		
		
	}

}
