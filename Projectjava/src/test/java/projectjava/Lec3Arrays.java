package projectjava;

public class Lec3Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] fruits= {"Mango","Watermalon","Orange","Apple"};
		
		System.out.println(fruits);
		
		String [] car= {"Honda","BMD","tesla","Audi","Toyota"};
		
		car[0] = "abc";
		System.out.println(car[0]);
		
		System.out.println(car.length);
		
		car[3] = "nissan";
		
		System.out.println(car[3]);
	}

}
