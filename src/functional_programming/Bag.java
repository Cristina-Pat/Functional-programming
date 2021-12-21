package functional_programming;

public class Bag {
	private String colour;
	private String model;
	private String material;
	private int price;
	private int year ;
	
	public Bag(String aColour, String aModel, String aMaterial, int aPrice, int anYear) {
		super();
		this.colour = aColour;
		this.model = aModel;
		this.price = aPrice;
		this.material = aMaterial;
		this.year = anYear;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	 
	public void print() {
		System.out.println("The " + this.colour + " "+ this.model + " from collection " + this.year + " is £" + this.price);
	}
}
