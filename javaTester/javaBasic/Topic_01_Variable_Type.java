package javaBasic;

import java.util.Scanner;

public class Topic_01_Variable_Type {
	
	//Ham khoi tao: phai trung ten vs class
	public Topic_01_Variable_Type() {
		
	}
	static int number;
	String address = "Ho Chi Minh";
	static int studentNumber;
	static boolean statusValue;
	static final String browser_Name = "Chrome"; //constant
	
	String studentName = "Automation";
	
	public static void main(String[] args) {
		System.out.println(studentNumber);
		System.out.println(browser_Name);
		System.out.println(Topic_01_Variable_Type.browser_Name); 
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println(name);
		System.out.println(name);
		
		System.out.println(number);
		
		//voi bien khong phai static thi phai khoi tao du lieu cho ham
		Topic_01_Variable_Type topic01 = new Topic_01_Variable_Type(); 
		System.out.println(topic01.address);
	}
	
	//Getter: getCurrentURL/getTitle/getAttribute/getCssValue/...
	public String getStudentName() {
		return this.studentName;
	}
	
	//Setter: click/sendKey/clear/back/forward/refresh/...
	public void setStudentName(String stdName) {
		this.studentName = stdName;
	}
	
}
