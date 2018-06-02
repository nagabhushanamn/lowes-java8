package com.patterns;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Strategy_Pattern_FP {

	public static void main(String[] args) {

		TaskList taskList = new TaskList();
		taskList.addTask(new Task("task-1", 4));
		taskList.addTask(new Task("task-2", 2));
		taskList.addTask(new Task("task-3", 3));
		taskList.addTask(new Task("task-4", 0));

		// taskList.setStrategy(tasks -> {
		// Task shortest = tasks.get(0);
		// for (Task task : tasks) {
		// if (shortest.getDuration() > task.getDuration()) {
		// shortest = task;
		// }
		// }
		// return shortest;
		// });

		Comparator<Task> comparator = (x, y) -> x.getDuration() - y.getDuration();
		SchedulingStrategy STFStratgy = list -> list.stream().min(comparator).get();
		taskList.setStrategy(STFStratgy);
		System.out.println(taskList.getNextTask());

	}

}
