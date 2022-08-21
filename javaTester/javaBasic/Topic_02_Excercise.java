package javaBasic;

import org.testng.annotations.Test;

public class Topic_02_Excercise {

		@Test
		public void RunEx() {
			Ex1(3,4);
			Ex2(7.5f, 3.8f);
			Ex3("Automation Testing");
		}
		
		public void Ex1(int a, int b){
			System.out.println("a + b = "+ (a+b));
			System.out.println("a - b = "+ (a-b));
			System.out.println("a * b = "+ (a*b));
			System.out.println("a / b = "+ (a/b));
		}
		
		
		public void Ex2(float length, float width) {
			System.out.println("S of rectange =" + (length * width));
		}
	
		
		public void Ex3(String name) {
			System.out.println("Hello: "+name);
		}
}
