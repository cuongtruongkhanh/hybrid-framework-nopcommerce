package javaBasic;

public class Topic_11_Exercise {
	int ID, Age, Score;
	String Name;

	public Topic_11_Exercise(int ID, String Name, int Age, int Score) {
		this.ID = ID;
		this.Name = Name;
		this.Age = Age;
		this.Score = Score;
	}

	public void display() {
		System.out.println(ID);
		System.out.println(Name);
		System.out.println(Age);
		System.out.println(Score);
	}

	public static void main(String[] args) {
		Topic_11_Exercise[] topic11 = new Topic_11_Exercise[4];

		topic11[0] = new Topic_11_Exercise(1, "Cuong", 30, 10);
		topic11[1] = new Topic_11_Exercise(2, "Nam", 31, 9);
		topic11[2] = new Topic_11_Exercise(3, "Hai", 32, 8);
		topic11[3] = new Topic_11_Exercise(4, "Tuan", 33, 7);

		for (int i = 0; i < topic11.length; i++) {
			topic11[i].display();
		}
	}

	public static void Ex01() {
		int array[] = { 1, 2, 3, 4, 9, 8, 7, 5, 5 };
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

	public static void Ex02() {
		int array[] = { 1, 2, 3, 4, 9, 8, 7, 5, 5 };

		int sum = array[0] + array[array.length - 1];

		System.out.println("Sum = " + sum);
	}

	public static void Ex03() {
		int array[] = { 1, 2, 3, 4, 9, 8, 7, 5, 5 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
	}

	public static void Ex06() {
		int arr[] = { 3, 5, 7, 30, 10, 5, 8, 23, 0, -5 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum = " + sum);
		System.out.println("Avg = " + (sum / arr.length));
	}

}
