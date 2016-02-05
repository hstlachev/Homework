public class Item {
	private String name;
	private int weigh;
	private int value;
	private double koef;

	public Item(String name, int weigh, int value) {
		this.name = name;
		this.weigh = weigh;
		this.value = value;
		this.koef = weigh / value;
	}

	public int getWeigh() {
		return weigh;
	}

	public void setWeigh(int weigh) {
		this.weigh = weigh;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public double getKoef() {
		return koef;
	}

}
