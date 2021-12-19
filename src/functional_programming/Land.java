package functional_programming;

public class Land {
	private int width; 
	private int length; 
	private String name;
	
	public Land(String aName, int aWidth, int aLenght) {
		this.name = aName;
		this.width = aWidth;
		this.length = aLenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int lenght) {
		this.length = lenght;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(name + " (" + width + "m X " + length + "m)" );
	}

}
