package com.patterns;

import java.util.ArrayList;
import java.util.List;

class DoorEventNew {
	int floor;
	int num;

	public DoorEventNew(int floor, int num) {
		super();
		this.floor = floor;
		this.num = num;
	}

	@Override
	public String toString() {
		return "door event";
	}
}

interface DoorListenerNew {
	public void start(DoorEventNew event);

	public void stop(DoorEventNew event);
}

// Main
class DoorNew {
	private List<DoorListenerNew> doorListeners = new ArrayList();

	public void addDoorListener(DoorListenerNew doorListener) {
		doorListeners.add(doorListener);
	}

	public void removeDoorListener(DoorListenerNew doorListener) {
		doorListeners.remove(doorListener);
	}

	public void open() {
		System.out.println("Door opened..");
		DoorEventNew doorEvent = new DoorEventNew(5, 4);
		// for (DoorListenerNew listener : doorListeners) {
		// listener.start(doorEvent);
		// }
		doorListeners
		.stream()
		.parallel()
		.forEach(listener->listener.start(doorEvent));
	}

	public void close() {
		System.out.println("Door closed..");
		DoorEventNew doorEvent = new DoorEventNew(5, 4);
		// for (DoorListenerNew listener : doorListeners) {
		// listener.stop(doorEvent);
		// }
		doorListeners
		.stream()
		.forEach(listener->listener.start(doorEvent));
	}
}

public class Listener_Pattern_FP {

	public static void main(String[] args) throws InterruptedException {

		DoorNew door = new DoorNew();

		// ----------------------------------------------

		DoorListenerNew light = new DoorListenerNew() {
			@Override
			public void stop(DoorEventNew event) {
				System.out.println("Light OFF >> " + event.floor + "\t" + event.num);
			}

			@Override
			public void start(DoorEventNew event) {
				System.out.println("Light ON >> " + event.floor + "\t" + event.num);
			}
		};
		door.addDoorListener(light);
		door.addDoorListener(light);
		door.addDoorListener(light);
		door.addDoorListener(light);
		door.addDoorListener(light);
		door.addDoorListener(light);
		DoorListenerNew ac = new DoorListenerNew() {
			@Override
			public void stop(DoorEventNew event) {
				System.out.println("AC OFF >> " + event.floor + "\t" + event.num);
			}

			@Override
			public void start(DoorEventNew event) {
				System.out.println("AC ON >> " + event.floor + "\t" + event.num);
			}
		};
		door.addDoorListener(ac);
		// ----------------------------------------------
		Thread.sleep(2000);
		door.open();
		Thread.sleep(2000);
		door.close();
		// ----------------------------------------------
		door.removeDoorListener(ac);
		// ----------------------------------------------
		Thread.sleep(2000);
		door.open();
		Thread.sleep(2000);
		door.close();
		// ----------------------------------------------

	}

}
