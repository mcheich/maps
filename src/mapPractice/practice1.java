package mapPractice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practice1 {

	public static void main(String[] args) {

		Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
		map.put("Spaghetti", new BigDecimal("8.97"));
		map.put("Lasagna", new BigDecimal("10.98"));
		map.put("Pizza", new BigDecimal("15.50"));
		map.put("Caesar Salad", new BigDecimal("7.00"));
		map.put("Kale Salad", new BigDecimal("7.00"));

		// Print the menu price of the spaghetti.
		System.out.print("1->   ");
		System.out.println(map.get("Spaghetti"));
		System.out.println();

		/**
		 * Print the number of menu items, so the owner will know how many more items
		 * she needs to add.
		 */
		System.out.print("2->   ");
		System.out.println(map.size());
		System.out.println();

		/**
		 * Add a “Bottle of Champagne” that costs $200.00 and a “Bottle of Vintage Wine”
		 * that costs $175.00 to the menu. After adding each of these, print the item’s
		 * price.
		 */
		map.put("Bottle of Champagne", new BigDecimal(200.00));
		System.out.print("3->   ");
		System.out.print(map.get("Bottle of Champagne") + "   ");
		map.put("Bottle of Vintage Wine", new BigDecimal(175.00));
		System.out.println(map.get("Bottle of Vintage Wine"));
		System.out.println();
		
		/**
		 * Print the boolean response returned from the method that checks to see if the
		 * “Bottle of Champagne” key exists.
		 */
		System.out.print("4->   ");
		System.out.println(map.containsKey("Bottle of Champagne"));
		System.out.println();
		
		/** Print the boolean response returned from the method that will 
		 * check to see if $13.50 is a price on the menu.
		 */
		System.out.print("5->   ");
		System.out.println(map.containsValue("13.50"));
		System.out.println();
		
		/**
		 * Remove “Kale Salad” from the menu. 
		 * Print a response showing that is no longer on the menu.
		 */
		map.remove("Kale Salad");
		System.out.print("6->   ");
		System.out.println("It is "+ map.containsKey("Kale Salad") + " that this item is on the menu");
		System.out.println();
		
	/**
	 * Clear the menu, removing all of the items and their prices, 
	 * so they can have a fresh start. 
	 * Before the chef and owner begin entering new items and prices, 
	 * they ask you to double check that all items were removed. 
	 * Print the boolean response returned by the method that will 
	 * check to see if the menu is clear.
	 */
		map.clear();
		System.out.print("7->   ");
		System.out.println(map.isEmpty());
	}

}
