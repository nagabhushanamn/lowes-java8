package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class MyList<E> implements Iterable<E> {
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}

public class Ex_3 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		for (String item : arrayList) {
		}

		LinkedList<String> linkedList = new LinkedList<>();
		for (String item : linkedList) {
		}

		MyList<String> myList = new MyList<String>();
		for (String item : myList) {

		}

	}

}
