package com;

import java.lang.reflect.InvocationTargetException;

import com.container.Container;

public class App {

	public static void main(String[] args) {

		Container container = new Container();
		try {
			container.process("/login");
			container.process("/register");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
