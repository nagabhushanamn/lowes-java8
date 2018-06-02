package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class Ex1 {

	public static void performanceCheck(List<String> list) {
		long start = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			list.add("hello");
		}
		long end = System.nanoTime();
		System.out.println(end - start);
	}

	public static void main(String[] args) {

		// performanceCheck(new ArrayList<>());
		// // performanceCheck(new LinkedList<>());
		// performanceCheck(new Vector<>());

		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue(10);

		Thread thread = new Thread(() -> {
			int i = 0;
			while (true) {
				i++;
				blockingQueue.add("item-" + i);
				System.out.println("produced-" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();

		Thread thread2 = new Thread(() -> {
			int i = 0;
			while (true) {
				System.out.println("consumed-" + blockingQueue.poll());
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread2.start();

	}

}
