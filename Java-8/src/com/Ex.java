package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 
 *  monads
 *  -------
 *  
 *   => apply new-context ( function ) to an element
 *   
 *   
 *   2 -ways
 *   -----------
 *   
 *   	-> unit   -> T -> M<T>
 *      -> bind   -> M<T>  -bind- -> M<R> 
 *      
 * 
 */

public class Ex {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("hello", "world"); // T

		// Stream<String> stringStream=list.stream(); // M<T>
		// Stream<Integer> intStream=stringStream.map(s->s.length()); // M<R>
		// Optional<Integer> optional=intStream.reduce((a,b)->a+b);
		// if(optional.isPresent()) {
		// System.out.println(optional.get());
		// }

		// Monads e.g Stream API

		// int sum=list
		// .stream()
		// .mapToInt(String::length)
		// .sum();
		//
		// System.out.println(sum);

		// --------------------------------------------------

		// Stream.map

		// IntStream.range(1, 10)
		// .map(n->n*n)
		// .forEach(System.out::println);

		// Stream.flatMap

		// --------------------------------------------------
		// IntStream.range(1, 3)
		// // .peek(System.out::println)
		// .flatMap(n -> IntStream.range(n, 10))
		// // .peek(System.out::println)
		// .forEach(System.out::println);
		// --------------------------------------------------

	}

}
