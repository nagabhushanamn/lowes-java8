package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Ex_3 {

	public static void main(String[] args) {

		// data-source ==> array | collection | file-input-stream | jdbc-resultset
		// Employee[] employees=Employee.SOME;
		//
		// List<String> highyPaid=
		// Arrays.stream(employees) // build-operation
		// .filter(e->e.getSalary()>=2500) // intermediate
		// .map(Employee::getName)
		// .sorted()
		// .collect(Collectors.toList());
		//
		//
		// System.out.println(highyPaid);

		// ------------------------------------------

		// Random random=new Random();
		// Stream
		// .generate(random::nextInt)
		// .filter(n->n>0)
		// .limit(10)
		// .forEach(n->System.out.println(n));

		// -------------------------------------------

		//
		// Stream
		// .iterate("*",s->s+"*")
		// .forEach(s->System.out.println(s));
		//

		// -------------------------------------------

		// List<Integer> integers = Arrays.asList(1, 3, 1, 2, 6, 7, 4, 3, 2, 5, 7, 9,
		// 4);
		// DoubleStream doubleStream = integers.stream().filter(n -> {
		// System.out.println("filtering " + n);
		// return n % 2 == 0;
		// }).limit(3).mapToDouble(n -> {
		// System.out.println("mapping " + n);
		// return n * n;
		// });
		//
		// System.out.println(doubleStream.sum());

		// ------------------------------------------

		// Monad
		// List<String> menu=Arrays.asList("idly,vada,poori","idly,vada,biryani");
		//
		// menu.
		// stream()
		// .flatMap(m->Stream.of(m.split(",")))
		// .distinct()
		// .forEach(item->System.out.println(item));

		// -----------------------------------

//		Stream<String> names = Stream.of("Nag", "Lowes"); // unit  // M<T>
//		Stream<String> newStream=names.map(s->s.toUpperCase());  //M<R>
//		Stream<String> newStream2= newStream.filter(s->s.equals("Lowes"));// M<S>
		
		//----------------------------------------
		
		
		List<Integer> integers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,3,4,5,6,7,8,8,4,3,3,56,7,8,89);
		
		integers
		.parallelStream()
		.filter(n->{
			System.out.println(Thread.currentThread().getName());
			return n%2==0;
		})
		.forEach(System.out::println);
		

	}

}
