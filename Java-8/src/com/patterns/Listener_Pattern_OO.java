package com.patterns;

import java.util.ArrayList;
import java.util.List;

class DoorEvent {
	int floor;
	int num;

	public DoorEvent(int floor, int num) {
		super();
		this.floor = floor;
		this.num = num;
	}

	@Override
	public String toString() {
		return "door event";
	}
}

interface DoorListener {
	public void start(DoorEvent event);

	public void stop(DoorEvent event);
}

// Main
class Door {
	private List<DoorListener> doorListeners = new ArrayList();

	public void addDoorListener(DoorListener doorListener) {
		doorListeners.add(doorListener);
	}

	public void removeDoorListener(DoorListener doorListener) {
		doorListeners.remove(doorListener);
	}

	public void open() {
		System.out.println("Door opened..");
		DoorEvent doorEvent = new DoorEvent(5, 4);
		for (DoorListener listener : doorListeners) {
			listener.start(doorEvent);
		}
	}

	public void close() {
		System.out.println("Door closed..");
		DoorEvent doorEvent = new DoorEvent(5, 4);
		for (DoorListener listener : doorListeners) {
			listener.stop(doorEvent);
		}
	}
}

public class Listener_Pattern_OO {

	public static void main(String[] args) throws InterruptedException {

		Door door = new Door();

		// ----------------------------------------------

		DoorListener light = new DoorListener() {
			@Override
			public void stop(DoorEvent event) {
				System.out.println("Light OFF >> " + event.floor + "\t" + event.num);
			}

			@Override
			public void start(DoorEvent event) {
				System.out.println("Light ON >> " + event.floor + "\t" + event.num);
			}
		};
		door.addDoorListener(light);
		DoorListener ac = new DoorListener() {
			@Override
			public void stop(DoorEvent event) {
				System.out.println("AC OFF >> " + event.floor + "\t" + event.num);
			}

			@Override
			public void start(DoorEvent event) {
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
