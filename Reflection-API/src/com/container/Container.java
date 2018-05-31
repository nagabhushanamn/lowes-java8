package com.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Container {

	public void process(String url) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Class<?> clazz = Class.forName("com.components.UserController");
		Object instance = clazz.newInstance();

		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
			if (requestMapping != null) {
				String givenUrl = requestMapping.url();
				// String httpMethod=requestMapping.method();
				if (url.equals(givenUrl)) {
					method.invoke(instance, new Object[] {});
				}
			}
		}
	}

}
