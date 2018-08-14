package encapsulation;

public class Students {
	private String name;
	String house="white";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private void demoOfPrivate() {
		System.out.println("This is hidden");
	}
	public void display() {
		demoOfPrivate();
	}
	public void demo(String house) {
		this.house=house;
		System.out.println(house);
	}

}
