package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class Ex_2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "b", "c");

		// External iteration

		// way-1
		// for (int i = 0; i < args.length; i++) {
		//
		// }
		// way-2 - uni-direction
		// Iterator<String> iterator = list.iterator();
		// while (iterator.hasNext()) {
		// String string = (String) iterator.next();
		// }
		// way-3
		// ListIterator<String> listIterator = list.listIterator();
		// way-4
		// for (String s : list) {
		// }
		// --------------------------------------------------------

		// Internal iteration ==> stream-api

		Stream<String> stream = list.stream(); // build ops
		stream
			// .map(s->s.toUpperCase())
			.map(String::toUpperCase) // intermediate
			// .forEach(s->System.out.println(s));
			.forEach(System.out::println); // terminal

	}

}
