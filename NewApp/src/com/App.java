package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {
	public static void main(String[] args) {

		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);

		Thread thread = new Thread(() -> {
			int i = 0;
			while (true) {
				i++;
				try {
					blockingQueue.put("item-" + i);
					System.out.println("produced-" + i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();

		Thread thread2 = new Thread(() -> {
			while (true) {
				try {
					System.out.println("consumed-" + blockingQueue.take());
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread2.start();

	}
}
