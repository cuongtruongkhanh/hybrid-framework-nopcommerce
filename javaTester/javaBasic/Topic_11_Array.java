package javaBasic;

public class Topic_11_Array {
	// Thuộc tính
	String name;
	int age;

	public Topic_11_Array(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		Topic_11_Array[] students = new Topic_11_Array[4];

		students[0] = new Topic_11_Array("Tuan", 24);
		students[1] = new Topic_11_Array("Cuong", 25);
		students[2] = new Topic_11_Array("Nam", 26);
		students[3] = new Topic_11_Array("Hai", 27);

		for (int i = 0; i < students.length; i++) {
			students[i].display();
		}

//		String studentName[] = { "Nam", "Linh", "Long", "An" };

//		// kiem tra duoc dieu kien
//		for (int i = 0; i < studentName.length; i++) {
//			if (studentName[i].equals("An")) {
//				System.out.println(studentName[i]);
//			}
//		}
//
//		// for each khong ket hop dieu kien (it khi dung)
//		for (String std : studentName) {
//			System.out.println(std);
//		}
//
//		ArrayList<String> stdName = new ArrayList<String>();
//
//		for (String std : stdName) {
//			stdName.add(std);
//		}
//
//		String std_Name = Arrays.toString(studentName);
//		System.out.println(std_Name);
	}

}
