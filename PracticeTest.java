

import java.util.*;



public class PracticeTest {
	public static void main(String [] args) {
		List<String> cities = new ArrayList<String>();
		cities.add("Atlanta");
		cities.add("Boston");
		cities.add("Chicago");
		for (String city : cities) {
			city = city.substring(5);
		}
		System.out.println(cities);
		String test = "test";
		System.out.println(test.substring(1));
		
	}
}
