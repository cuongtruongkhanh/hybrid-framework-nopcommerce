package javaBasic;

public class Topic_03_Compare {

	int number = 12;
	
	public static void main(String[] args) {
		//1 vùng nhớ cho biến x
		int x = 5;
		
		//1 vùng nhớ cho biến y
		int y = x;
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		
		x = 8;
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		
		y = 10;
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		
		
		Topic_03_Compare firstVariable = new Topic_03_Compare();
		Topic_03_Compare secondVariable = new Topic_03_Compare();
		
		System.out.println("firstVariable number: "+firstVariable.number);
		System.out.println("secondVariable number: "+secondVariable.number);
		
		
		secondVariable.number = 15;
		System.out.println("firstVariable number: "+firstVariable.number);
		System.out.println("secondVariable number: "+secondVariable.number);
		
		 
		
	}
}
