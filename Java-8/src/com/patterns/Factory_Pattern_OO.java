package com.patterns;

interface Food {
	String getFood();
}

class Veg implements Food {
	@Override
	public String getFood() {
		return "Veg Food";
	}
}

class NonVeg implements Food {
	@Override
	public String getFood() {
		return "Non-Veg-Food";
	}
}

// ------------------------------------------------------

class FoodFactory {
	public static Food getInstance(String type) {
		// pre init / condition check

		// post init..
		return new Veg();
	}
}

// ------------------------------------------------------

public class Factory_Pattern_OO {
	public static void main(String[] args) {

		Food food = FoodFactory.getInstance("veg");

	}
}
