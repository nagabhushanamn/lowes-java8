package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// FP ==> for concise & expressive code

public class Why_FP_Ex1 {

	public static void main(String[] args) {

		List<String> menu = new ArrayList<>();
		menu.add("idly");
		menu.add("poori");
		menu.add("vada");

		//
		// --------------------------------------------------------------------------
		// A. Imperative style ( 'what' + 'how' coding )
		Iterator<String> iterator = menu.iterator();
		while (iterator.hasNext()) {
			String item = (String) iterator.next();
			if (item.equals("poori"))
				iterator.remove();
		}
		System.out.println(menu);

		// --------------------------------------------------------------------------

		// --------------------------------------------------------------------------
		// B. Functional style ( only 'what' coding)
		menu.removeIf(item -> item.equals("poori"));
		// --------------------------------------------------------------------------
	}

}
