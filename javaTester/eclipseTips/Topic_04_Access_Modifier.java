package eclipseTips;

public class Topic_04_Access_Modifier {

	public static void main(String[] args) {
		Topic_03_Getter_Setter topic3 = new Topic_03_Getter_Setter();

		topic3.setCarName("Toyota");
		topic3.setCarColor("Red");
		topic3.setCarType("Sedan");

		System.out.println(topic3.getCarName());
		System.out.println(topic3.getCarColor());
		System.out.println(topic3.getCarType());
	}
}
