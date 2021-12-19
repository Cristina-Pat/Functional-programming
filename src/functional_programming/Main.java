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
	
	public static void main(String[] args) {
		landLambda();
	}
}
