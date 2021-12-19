package functional_programming;

public class Car {
	private String colour;
	private String model;
	private int price;
	private int horsepower;
	
	public Car(String aColour, String aModel, int aPrice, int aHorsepower) {
		super();
		this.colour = aColour;
		this.model = aModel;
		this.price = aPrice;
		this.horsepower = aHorsepower;
	}
	
	public void print() {
		System.out.println(this.model + " " + this.colour + " " + this.horsepower + "hp  £" + this.price);
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String aColour) {
		this.colour = aColour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String aModel) {
		this.model = aModel;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int aPrice) {
		this.price = aPrice;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int aHorsepower) {
		this.horsepower = aHorsepower;
	}

	
}
