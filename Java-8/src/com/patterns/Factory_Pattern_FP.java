package com.patterns;

import java.util.function.Supplier;

public class Factory_Pattern_FP {
	public static void main(String[] args) {

		Supplier<Food> vegFood = Veg::new;
		Supplier<Food> nonVegFood = NonVeg::new;

	}
}
