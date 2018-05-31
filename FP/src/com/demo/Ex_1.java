package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex_1 {

	public static void main(String[] args) {

		List<String> items = new ArrayList<>();
		items.add("idly");
		items.add("vada");
		items.add("poori");

		// --------------------------------------

		// OO with imperative style
		// Iterator<String> iterator = items.iterator();
		// while (iterator.hasNext()) {
		// String item = (String) iterator.next();
		// if (item.equals("vada"))
		// iterator.remove();
		// }

		// functional-style
		items.removeIf(item->item.equals("vada"));

		// --------------------------------------

	}

}
