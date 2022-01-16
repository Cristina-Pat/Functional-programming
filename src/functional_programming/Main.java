package functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void carsLambda() {
		List<Car> carsOnStock = new ArrayList<Car>(Arrays.asList(
				new Car("Red", "5 Series", 53000, 340),
				new Car("Gray", "5 Series", 45000, 220),
				new Car("Black", "5 Series", 49500, 190),
				new Car("Black", "5 Series", 47800, 220),
				new Car("Red", "3 Series", 33000, 240),
				new Car("Gray", "3 Series", 37000, 190),
				new Car("Blue", "3 Series", 36700, 320),
				new Car("Red", "5 Series", 38500, 240)
			));

		Double conversionRate = 1.18;
	/*
	carsOnStock 
		.stream()
		.filter(c -> c.getPrice() > 35000 && c.getPrice() < 40000)
		.filter(c -> c.getHorsepower() > 200)
		.forEach(c -> c.print());
	*/
	/*			
		carsOnStock
		.stream()
		.map(c -> c.getPrice() * 1.18)
		.forEach(p -> System.out.println(p));
	*/
		
		
		Double totalPrice = carsOnStock
			.stream()
			.filter(c -> c.getModel().equals("5 Series"))
			.map(c -> c.getPrice() * conversionRate)
			.reduce(0.0, (total, p) -> {return total + p;});
		
		System.out.println("The total cost of the 5 Series stock is " + totalPrice + " Euro");
		
	}
	
	/*

	public static void landLambda() {
		List<Land> lands = new ArrayList<Land>(Arrays.asList(
				new Land("Chilton Heights", 500, 700), 
				new Land("Didcot Palace", 1500, 800),
				new Land("Abingdon Valley", 300, 700),
				new Land("Hinksey Hill", 1300, 1500),
				new Land("Boar Hill", 900, 1700),
				new Land("Rose Hill", 2500, 700)
				));
	
		
		System.out.println("Lands owned:");
		lands
			.stream()
			.forEach(l -> l.print());
		
		double tax = 0.075;
		double totalTax =  lands
			.stream()
			.map(l -> (double)(l.getWidth() * l.getLength() * tax))
			.reduce(0.00, (total, areaTax) -> {
					return total + areaTax;
				}
			);
		System.out.println("The tax owed is £" + totalTax);
	} 
	
	*/
	
	
	/*
	public static void main(String[] args) {
		bagLambda();
	}
	
	public static void bagLambda() {
		List<Bag> bags = new ArrayList<Bag>(Arrays.asList(
				new Bag("brown", "Gucci", "coated canvas", 225, 2021),
				new Bag("red", "Versace", "leather", 195, 2020),
				new Bag("violet", "Tory Burch", "leather", 475, 2022),
				new Bag("grey", "Celline", "leather", 225, 2022),
				new Bag("black", "Gucci", "leather", 1750, 2021),
				new Bag("blue", "Michael Kors", "coated canvas", 158, 2020)
				));
	

		System.out.println("Bags in stock: ");
		bags
			.stream()
			.filter(b -> b.getMaterial().equals("leather"))
			.forEach(b -> b.print());
		
		double totalPrice = bags
			.stream()
			.filter(b -> b.getMaterial().equals("leather"))
			.reduce(0.00, (total, bag) -> {return total + (bag.getPrice() * 1.20);}, Double::sum);
			
		System.out.println("The total cost with VAT of leather bag stock is £" + totalPrice);		
	}
*/
	public static void main(String[] args) {
		gemLambda();
	}
	
	public static void gemLambda() {
		List<Gem> gemStones = new ArrayList<Gem>(Arrays.asList(
				new Gem("ruby", "red", 2.23f), 
				new Gem("saphire", "blue", 1.3f),
				new Gem("amethyst", "purple", 0.75f),
				new Gem("emerald", "green", 0.55f),
				new Gem("lapis", "blue", 1.25f),
				new Gem("diamond", "red", 0.60f), 
				new Gem("saphire", "red", 0.50f),
				new Gem("amethyst", "purple", 0.30f),
				new Gem("emerald", "green", 0.83f),
				new Gem("lapis", "blue", 0.25f),
				new Gem("ruby", "red", 1.40f)
				));
		System.out.println("Red gemstones in stock: ");
		gemStones.stream()
        .filter(gem -> gem.getColour() == "red")
        .forEach(gem -> System.out.println(gem.toString()));
		
		System.out.println("NonRuby gemstones in stock: ");
		printNonRubyWeights(gemStones);
	}
	
    public static void printNonRubyWeights(List<Gem> gems)
    {
        gems.stream()
        .filter(stone -> stone.getKind() != "ruby")
        .map(stone -> stone.getWeight())
        .forEach(detail -> System.out.println( "ct: " + String.format("%.2f", detail)));
    }
    
}

