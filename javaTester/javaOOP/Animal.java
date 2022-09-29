package javaOOP;

public abstract class Animal {

	// Variable
	String annimalName = "Dog";

	// Method
	// Không có phần thân
	// public, protected
	// Bắt buộc các class con phải override các hàm còn lại
	abstract void setAnnimalName();
}
