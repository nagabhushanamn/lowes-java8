package com;

import java.util.Observable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class App2 {

	public static void main(String...args) {

		ExecutorService executorService = Executors.newFixedThreadPool(8);

		for (int i = 0; i < 100; i++) {
			executorService.submit(() -> {
				System.out.println("task==>" + Thread.currentThread().getName());
			});
		}
		

	}

}
